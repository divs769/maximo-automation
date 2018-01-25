package com.shopdirect.maximoautomation.infrastructure.maximo.client.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.maximo.*;
import com.ibm.maximo.wsdl.mxiswochange.MXISWOCHANGE;
import com.ibm.maximo.wsdl.mxiswochange.MXISWOCHANGEPortType;
import com.shopdirect.maximoautomation.infrastructure.config.MaximoChangeRequestConfig;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JAXWSMaximoClient implements MaximoClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(JAXWSMaximoClient.class);
    private final ObjectFactory objectFactory = new ObjectFactory();
    private final MaximoChangeRequestConfig maximoChangeRequestConfig;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final MXISWOCHANGE client;

    public JAXWSMaximoClient(
            String maximoUrl,
            MaximoChangeRequestConfig maximoChangeRequestConfig
    ) {
        this.maximoChangeRequestConfig = maximoChangeRequestConfig;
        this.client = createAndConfigureClient(maximoUrl);
    }

    private MXISWOCHANGE createAndConfigureClient(String maximoUrl) {
        MXISWOCHANGE client = new MXISWOCHANGE();
        MXISWOCHANGEPortType port = client.getMXISWOCHANGESOAP11Port();
        ((BindingProvider) port).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, maximoUrl);
        return client;
    }

    @Override
    public String createChange(BuildInfo buildInfo) {
        LOGGER.info("Calling IBM Maximo to create a change request");

        CreateMXISWOCHANGEResponseType response = client.getMXISWOCHANGESOAP11Port()
                .createMXISWOCHANGE(createMXISWOCHANGEType(buildInfo));

        try {
            LOGGER.info("Response: \n{}\n", objectMapper.writeValueAsString(response));
        } catch (JsonProcessingException e) {
            LOGGER.error("Error parsing response from IBM Maximo", e);
        }

        return response.getWOCHANGEMboKeySet().getWOCHANGE().get(0).getWONUM().getValue();
    }

    @Override
    public void updateChange(BuildInfo buildInfo) {

    }

    private CreateMXISWOCHANGEType createMXISWOCHANGEType(BuildInfo buildInfo) {
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
        wochange.setPMCHGTYPE(createMXDomainType(maximoChangeRequestConfig.getChangeType()));
        wochange.setOWNERGROUP(createMXStringType(maximoChangeRequestConfig.getOwnerGroup()));
        wochange.setCINUM(createMXStringType(maximoChangeRequestConfig.getCiNum()));
        wochange.setCLASSIFICATIONID(createMXStringType(maximoChangeRequestConfig.getClassificationID()));
        wochange.setSITEID(createMXStringType(maximoChangeRequestConfig.getSiteId()));
        wochange.setDESCRIPTION(createMXStringType(buildChangeDescription(buildInfo)));
        wochange.setREASONFORCHANGE(createMXStringType(maximoChangeRequestConfig.getReasonForChange()));

//        wochange.setLOCATION(createMXStringType("BLD902"));
//        wochange.setORGID(createMXStringType("ORG1"));
//        wochange.setORIGRECORDCLASS(createMXStringType("SR"));
//        wochange.setORIGRECORDID(createMXStringType("SR1032"));

        Date startDate = new Date();
        wochange.setSCHEDSTART(createSCHEDSTARTAsJAXBElement(startDate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        cal.add(Calendar.HOUR, 2);
        Date finishDate = cal.getTime();
        wochange.setSCHEDFINISH(createSCHEDFINISHAsJAXBElement(finishDate));

        MXISWOCHANGESetType changeSet = objectFactory.createMXISWOCHANGESetType();
        changeSet.getWOCHANGE().add(wochange);

        CreateMXISWOCHANGEType change = objectFactory.createCreateMXISWOCHANGEType();
        change.setMXISWOCHANGESet(changeSet);

        return change;
    }

    private String buildChangeDescription(BuildInfo buildInfo) {
        String description = String.format(
                maximoChangeRequestConfig.getDescription(),
                buildInfo.getUrl(),
                buildInfo.getVcTag(),
                buildInfo.getVcHash(),
                buildInfo.getVcDescription()
        );
        return description;
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

    private MXDateTimeType createMXDateTimeType(Date date) {
        MXDateTimeType mxDateType = objectFactory.createMXDateTimeType();
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(
                GregorianCalendar.from(ZonedDateTime.from(date.toInstant().atZone(ZoneId.systemDefault())))
        );
        mxDateType.setValue(calendar);
        return mxDateType;
    }

    private JAXBElement<MXDateTimeType> createSCHEDSTARTAsJAXBElement(Date date) {
        return objectFactory.createMXISWOCHANGEWOACTIVITYTypeSCHEDSTART(createMXDateTimeType(date));
    }

    private JAXBElement<MXDateTimeType> createSCHEDFINISHAsJAXBElement(Date date) {
        return objectFactory.createMXISWOCHANGEWOACTIVITYTypeSCHEDFINISH(createMXDateTimeType(date));
    }

    private MXDomainType createMXDomainType(String value) {
        MXDomainType domainType = objectFactory.createMXDomainType();
        domainType.setValue(value);
        return domainType;
    }
}
