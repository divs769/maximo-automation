package com.shopdirect.maximoautomation.infrastructure.maximo.client.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.maximo.*;
import com.ibm.maximo.wsdl.mxiswochange.MXISWOCHANGE;
import com.ibm.maximo.wsdl.mxiswochange.MXISWOCHANGEPortType;
import com.shopdirect.maximoautomation.infrastructure.config.MaximoChangeRequestConfig;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;

public class JAXWSMaximoClient implements MaximoClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(JAXWSMaximoClient.class);
    private final ObjectFactory objectFactory = new ObjectFactory();
    private final MaximoChangeRequestConfig maximoChangeRequestConfig;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private MXISWOCHANGE client;

    public JAXWSMaximoClient(
            String maximoUrl,
            MaximoChangeRequestConfig maximoChangeRequestConfig
    ) {
        this.maximoChangeRequestConfig = maximoChangeRequestConfig;
        initClient(maximoUrl);
    }

    private void initClient(String maximoUrl) {
        client = new MXISWOCHANGE();
        MXISWOCHANGEPortType port = client.getMXISWOCHANGESOAP11Port();
        ((BindingProvider) port).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, maximoUrl);
    }

    @Override
    public String createChange(BuildInfo buildInfo) {
        LOGGER.info("Calling IBM Maximo to create a change request");

        CreateMXISWOCHANGEResponseType response = client.getMXISWOCHANGESOAP11Port()
                .createMXISWOCHANGE(createMXISWOCHANGEType(buildInfo));

        try {
            LOGGER.info("Response: \n{}\n", objectMapper.writeValueAsString(response));
        } catch (JsonProcessingException e) {
            LOGGER.error("Error parsing response", e);
        }

        return response.getWOCHANGEMboKeySet().getWOCHANGE().get(0).getWONUM().getValue();
    }

    @Override
    public void updateChange(BuildInfo buildInfo) {

    }

    private CreateMXISWOCHANGEType createMXISWOCHANGEType(BuildInfo buildInfo) {
        CreateMXISWOCHANGEType change = objectFactory.createCreateMXISWOCHANGEType();
        MXISWOCHANGESetType changeSet = objectFactory.createMXISWOCHANGESetType();

        MXISWOCHANGEWOCHANGEType wochange = objectFactory.createMXISWOCHANGEWOCHANGEType();
        wochange.setDESCRIPTION(createMXStringType(buildInfo.getUrl()));
        wochange.setPMCHGPROBABILITYFAILURE(
                objectFactory
                        .createWOCHANGEObjectTypePMCHGPROBABILITYFAILURE(
                                createMXLongType(maximoChangeRequestConfig.getProbabilityFailure())
                        )
        );
        wochange.setPMCOMIMPACT(objectFactory
                .createWOCHANGEObjectTypePMCOMIMPACT(createMXLongType(maximoChangeRequestConfig.getImpact()))
        );
        wochange.setPMCOMURGENCY(objectFactory
                .createWOCHANGEObjectTypePMCOMURGENCY(createMXLongType(maximoChangeRequestConfig.getUrgency()))
        );
        wochange.setCLASSIFICATIONID(createMXStringType(maximoChangeRequestConfig.getClassificationID()));
        wochange.setCINUM(createMXStringType(maximoChangeRequestConfig.getCiNum()));
        wochange.setSITEID(createMXStringType(maximoChangeRequestConfig.getSiteId()));
        wochange.setDESCRIPTION(createMXStringType("Change Request created by Maximo-Automation microservice"));

        changeSet.getWOCHANGE().add(wochange);
        change.setMXISWOCHANGESet(changeSet);
        return change;
    }

    private MXStringType createMXStringType(String value) {
        MXStringType mxStringType = objectFactory.createMXStringType();
        mxStringType.setValue(value);
        return mxStringType;
    }

    private MXLongType createMXLongType(long value) {
        MXLongType mxLongType = objectFactory.createMXLongType();
        mxLongType.setValue(value);
        return mxLongType;
    }
}
