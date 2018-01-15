package com.shopdirect.maximoautomation.infrastructure.maximo.client.impl;

import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.maximo.ws.*;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class JAXBMaximoClient extends WebServiceGatewaySupport implements MaximoClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(JAXBMaximoClient.class);
    private final ObjectFactory objectFactory;

    public JAXBMaximoClient() {
        this.objectFactory = new ObjectFactory();
    }

    @Override
    public void createChange(BuildInfo buildInfo) {
        CreateMXISWOCHANGEType change = createMXISWOCHANGEType(buildInfo);

        LOGGER.info("Creating change in maximo");
        LOGGER.info("Change object: \n{}", change);

        try {
            CreateMXISWOCHANGEResponseType response = (CreateMXISWOCHANGEResponseType) getWebServiceTemplate()
                    .marshalSendAndReceive(objectFactory.createCreateMXISWOCHANGE(change));
            LOGGER.info("Response from maximo was {}", response);
        } catch (Exception e) {
            LOGGER.error("Error calling Maximo", e);
            throw new RuntimeException("Couldn't create the change in Maximo");
        }

    }

    @Override
    public void updateChange(BuildInfo buildInfo) {

    }

    private static CreateMXISWOCHANGEType createMXISWOCHANGEType(BuildInfo buildInfo) {
        CreateMXISWOCHANGEType change = objectFactory.createCreateMXISWOCHANGEType();
        MXISWOCHANGESetType changeSet = objectFactory.createMXISWOCHANGESetType();

        MXISWOCHANGEWOCHANGEType wochange = objectFactory.createMXISWOCHANGEWOCHANGEType();
        wochange.setDESCRIPTION(createMXStringType(buildInfo.getUrl()));
        wochange.setPMCHGPROBABILITYFAILURE(
                objectFactory.createWOCHANGEObjectTypePMCHGPROBABILITYFAILURE(createMXLongType(2))
        );
        wochange.setPMCOMIMPACT(objectFactory.createWOCHANGEObjectTypePMCOMIMPACT(createMXLongType(2)));
        wochange.setPMCOMURGENCY(objectFactory.createWOCHANGEObjectTypePMCOMURGENCY(createMXLongType(3)));
        wochange.setCLASSIFICATIONID(createMXStringType("ULL_TELEPHONY"));
        wochange.setCINUM(createMXStringType("PMSC_LINUX1"));
        wochange.setSITEID(createMXStringType("ITD-ESLS"));

        changeSet.getWOCHANGE().add(wochange);
        change.setMXISWOCHANGESet(changeSet);
        return change;
    }

    private static MXStringType createMXStringType(String value) {
        MXStringType mxStringType = objectFactory.createMXStringType();
        mxStringType.setValue(value);
        return mxStringType;
    }

    private static MXLongType createMXLongType(long value) {
        MXLongType mxLongType = objectFactory.createMXLongType();
        mxLongType.setValue(value);
        return mxLongType;
    }
}
