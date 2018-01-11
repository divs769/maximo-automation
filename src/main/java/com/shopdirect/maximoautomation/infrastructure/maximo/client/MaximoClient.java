package com.shopdirect.maximoautomation.infrastructure.maximo.client;

import com.shopdirect.maximoautomation.infrastructure.maximo.ws.CreateMXISWOCHANGEResponseType;
import com.shopdirect.maximoautomation.infrastructure.maximo.ws.CreateMXISWOCHANGEType;
import com.shopdirect.maximoautomation.infrastructure.maximo.ws.ObjectFactory;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class MaximoClient extends WebServiceGatewaySupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(MaximoClient.class);
    private final ObjectFactory objectFactory;

    public MaximoClient() {
        this.objectFactory = new ObjectFactory();
    }

    public void createChange(BuildInfo buildInfo) {
        CreateMXISWOCHANGEType change = objectFactory.createCreateMXISWOCHANGEType();

        LOGGER.info("Creating change in maximo");

        try {
            CreateMXISWOCHANGEResponseType response = (CreateMXISWOCHANGEResponseType) getWebServiceTemplate()
                    .marshalSendAndReceive(objectFactory.createCreateMXISWOCHANGE(change)/*,
                            new SoapActionCallback("CreateMXISWOCHANGEResponse")*/);
            LOGGER.info("Response from maximo was {}", response);
        } catch (Exception e) {
            LOGGER.error("Error calling Maximo", e);
            throw new RuntimeException("Couldn't create the change in Maximo");
        }

    }
}
