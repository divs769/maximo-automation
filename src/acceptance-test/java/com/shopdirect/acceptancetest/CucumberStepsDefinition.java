package com.shopdirect.acceptancetest;

import com.shopdirect.maximoautomation.ServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@ContextConfiguration(
        classes = ServiceApplication.class
    )
@SpringBootTest(webEnvironment = DEFINED_PORT)
@AutoConfigureWireMock(port = 9090)
@TestPropertySource(properties = {
        "amazon.dynamodb.endpoint=http://localhost:8000/",
        "amazon.dynamodb.region=eu-west-1",
        "ibm.maximo.url=http://localhost:9090/soap"
})
public class CucumberStepsDefinition {
}
