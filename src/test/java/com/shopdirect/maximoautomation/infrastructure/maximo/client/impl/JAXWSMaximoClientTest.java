package com.shopdirect.maximoautomation.infrastructure.maximo.client.impl;

import com.github.tomakehurst.wiremock.client.RemoteMappingBuilder;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.netflix.config.ConfigurationManager;
import com.shopdirect.maximoautomation.infrastructure.config.MaximoChangeRequestConfig;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import org.apache.commons.configuration.AbstractConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.OffsetDateTime;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWireMock(port = 9090)
@TestPropertySource( properties = {
    "ibm.maximo.url=http://localhost:9090/maximo"
})
public class JAXWSMaximoClientTest {
    private static final String TEST_URL = "/maximo";
    private static final Boolean OPEN = true;
    private static final Boolean CLOSED = false;

    @MockBean
    private MaximoChangeRequestConfig maximoChangeRequestConfig;

    @Autowired
    private MaximoClient instance;

    @Before
    public void setUp() throws Exception {
        when(maximoChangeRequestConfig.getCiNum()).thenReturn("ciNum");
        when(maximoChangeRequestConfig.getChangeType()).thenReturn("chgType");
        when(maximoChangeRequestConfig.getClassificationID()).thenReturn("classID");
        when(maximoChangeRequestConfig.getDescription()).thenReturn("Description");
        when(maximoChangeRequestConfig.getImplDescription()).thenReturn("desc %s %s %s %s");
        when(maximoChangeRequestConfig.getImpact()).thenReturn(3L);
        when(maximoChangeRequestConfig.getOwnerGroup()).thenReturn("OwnerGroup");
        when(maximoChangeRequestConfig.getProbabilityFailure()).thenReturn(3L);
        when(maximoChangeRequestConfig.getSiteId()).thenReturn("SiteID");
        when(maximoChangeRequestConfig.getReasonForChange()).thenReturn("Reason");
        when(maximoChangeRequestConfig.getUrgency()).thenReturn(3L);
    }

    @After
    public void tearDown() throws Exception {
        setCircuitBreakerState(CLOSED);
        WireMock.reset();
    }

    @Test
    public void circuitBreakerClosedShouldReturnResponseFromDownstreamCallForCreateChange() throws Exception {
        // Given
        setCircuitBreakerState(CLOSED);
        primeMaximoMockServerForCreateChange();
        BuildInfo buildInfo = createBuildInfoMock();

        // When
        String response = instance.createChange(buildInfo);

        // Then
        verify(postRequestedFor(urlEqualTo(TEST_URL)));
        assertThat(response).isEqualTo("CHG1659");
    }

    @Test
    public void circuitBreakerClosedShouldReturnResponseFromDownstreamCallForCloseChange() throws Exception {
        // Given
        setCircuitBreakerState(CLOSED);
        primeMaximoMockServerForUpdateChange();

        // When
        instance.closeChange("CH123");

        // Then
        verify(postRequestedFor(urlEqualTo(TEST_URL)));
    }

    @Test
    public void circuitBreakerOpenShouldTriggerFallback() throws Exception {
        // Given
        setCircuitBreakerState(OPEN);
        primeMaximoMockServerForCreateChange();

        // When
        String response = instance.createChange(createBuildInfoMock());

        // Then
        verify(0, getRequestedFor(urlEqualTo(TEST_URL)));
        assertThat(response).isNull();
    }

    private BuildInfo createBuildInfoMock() {
        BuildInfo buildInfo = mock(BuildInfo.class);
        when(buildInfo.getId()).thenReturn("id");
        when(buildInfo.getStatus()).thenReturn(SUCCESS);
        OffsetDateTime startDateTime = OffsetDateTime.now().minusHours(2);
        when(buildInfo.getStartTime()).thenReturn(startDateTime);
        when(buildInfo.getFinishTime()).thenReturn(startDateTime.plusHours(1));
        return buildInfo;
    }

    private void setCircuitBreakerState(Boolean isOpen) {
        AbstractConfiguration config = ConfigurationManager.getConfigInstance();
        config.setProperty("hystrix.command.default.circuitBreaker.forceOpen", isOpen.toString());
        config.setProperty("hystrix.command.default.circuitBreaker.forceClosed", "" + !isOpen );
    }

    private void primeMaximoMockServerForCreateChange() {
        StringBuffer responseBodyForCreate = new StringBuffer();
        responseBodyForCreate
                .append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">")
                .append("<soapenv:Body>")
                .append("<CreateMXISWOCHANGEResponseType creationDateTime=\"2018-01-24T14:35:57+00:00\" transLanguage=\"EN\" baseLanguage=\"EN\" xmlns=\"http://www.ibm.com/maximo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" )
                .append("<WOCHANGEMboKeySet>")
                .append("<WOCHANGE>")
                .append("<SITEID>ITD-ESLS</SITEID>")
                .append("<WONUM>CHG1659</WONUM>")
                .append("</WOCHANGE>")
                .append("</WOCHANGEMboKeySet>")
                .append("</CreateMXISWOCHANGEResponseType>")
                .append("</soapenv:Body>")
                .append("</soapenv:Envelope>");

        ResponseDefinitionBuilder responseBuilder = aResponse()
                .withHeader("Content-Type", "text/xml; charset=UTF-8")
                .withBody(responseBodyForCreate.toString());

        primeMaximoMockServer(post(urlEqualTo(TEST_URL)), responseBuilder);
    }

    private void primeMaximoMockServerForUpdateChange() {
        StringBuffer responseBodyForUpdate = new StringBuffer();
        responseBodyForUpdate
                .append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">")
                .append("<soapenv:Body>")
                .append("<UpdateMXISWOCHANGEResponseType messageID=\"4123413\" creationDateTime=\"2018-01-24T14:35:57+00:00\" transLanguage=\"EN\" baseLanguage=\"EN\" xmlns=\"http://www.ibm.com/maximo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" )
                .append("</UpdateMXISWOCHANGEResponseType>")
                .append("</soapenv:Body>")
                .append("</soapenv:Envelope>");

        ResponseDefinitionBuilder responseBuilder = aResponse()
                .withHeader("Content-Type", "text/xml; charset=UTF-8")
                .withBody(responseBodyForUpdate.toString());

        primeMaximoMockServer(post(urlEqualTo(TEST_URL)), responseBuilder);
    }

    private void primeMaximoMockServer(
            RemoteMappingBuilder mappingBuilder,
            ResponseDefinitionBuilder responseDefinitionBuilder) {
        stubFor(
                withDefaultHeaders(mappingBuilder)
                        .withRequestBody(matching(".*"))
                        .willReturn(responseDefinitionBuilder)
        );
    }

    private RemoteMappingBuilder withDefaultHeaders(RemoteMappingBuilder mappingBuilder) {
        return mappingBuilder
                .withHeader("SOAPAction", matching(".*"))
                .withHeader("Accept", matching(".*"))
                .withHeader("User-Agent", matching(".*"))
                .withHeader("Connection", matching(".*"))
                .withHeader("Host", matching(".*"))
                .withHeader("Content-Length", matching(".*"))
                .withHeader("Content-Type", matching(".*"));
    }
}