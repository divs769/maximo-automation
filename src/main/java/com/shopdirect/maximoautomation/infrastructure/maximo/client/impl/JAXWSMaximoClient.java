package com.shopdirect.maximoautomation.infrastructure.maximo.client.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.maximo.*;
import com.ibm.maximo.wsdl.mxiswochange.MXISWOCHANGE;
import com.ibm.maximo.wsdl.mxiswochange.MXISWOCHANGEPortType;
import com.shopdirect.maximoautomation.infrastructure.config.MaximoChangeRequestConfig;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
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
    private final MXISWOCHANGEPortType client;

    public JAXWSMaximoClient(
            String maximoUrl,
            MaximoChangeRequestConfig maximoChangeRequestConfig
    ) {
        this.maximoChangeRequestConfig = maximoChangeRequestConfig;
        this.client = createAndConfigureClient(maximoUrl);
    }

    private MXISWOCHANGEPortType createAndConfigureClient(String maximoUrl) {
        LOGGER.info("Initializing Maximo client. URL: {}", maximoUrl);

        MXISWOCHANGEPortType port = new MXISWOCHANGE().getMXISWOCHANGESOAP11Port();
        ((BindingProvider) port).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, maximoUrl);

        return port;
    }

    @Override
    public String createChange(BuildInfo buildInfo) {
        LOGGER.info("Calling IBM Maximo to CREATE a change request");

        try {
            CreateMXISWOCHANGEResponseType response = client
                    .createMXISWOCHANGE(createMXISWOCHANGEType(buildInfo));
            return response.getWOCHANGEMboKeySet().getWOCHANGE().get(0).getWONUM().getValue();
        } catch (DatatypeConfigurationException e) {
            LOGGER.error("Data type error before calling maximo", e);
            throw new RuntimeException("Can't call IBM Maximo due to data error", e);
        } catch (Exception e) {
            LOGGER.error("Error calling IBM Maximo to create change", e);
            throw new RuntimeException("Error calling IBM Maximo to create change", e);
        }
    }

    @Override
    public void closeChange(String changeID) {
        LOGGER.info("Calling IBM Maximo to CLOSE a change request");

        try {
            UpdateMXISWOCHANGEResponseType response = client
                    .updateMXISWOCHANGE(createUpdateMXISWOCHANGETypeForClose(changeID));

            LOGGER.info("Change #{} has been successfuly closed. Maximo message ID is {}",
                    changeID, response.getMessageID());
        } catch(Exception e) {
            LOGGER.error("Error calling IBM Maximo to close change #" + changeID, e);
            throw new RuntimeException("Error calling IBM Maximo to close change #{}" + changeID, e);
        }
    }

    private CreateMXISWOCHANGEType createMXISWOCHANGEType(BuildInfo buildInfo) throws DatatypeConfigurationException {
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
        wochange.setDESCRIPTION(createMXStringType(maximoChangeRequestConfig.getDescription()));
        wochange.setPMCHGIMPDESC(createMXStringType(buildImplDescription(buildInfo)));
        wochange.setREASONFORCHANGE(createMXStringType(maximoChangeRequestConfig.getReasonForChange()));

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

    private UpdateMXISWOCHANGEType createUpdateMXISWOCHANGETypeForClose(String changeID) {
        MXISWOCHANGEWOCHANGEType wochange = objectFactory.createMXISWOCHANGEWOCHANGEType();
        wochange.setWONUM(createMXStringType(changeID));
        wochange.setSTATUS(createMXDomainType("CLOSE"));

        MXISWOCHANGESetType changeSet = objectFactory.createMXISWOCHANGESetType();
        changeSet.getWOCHANGE().add(wochange);

        UpdateMXISWOCHANGEType update = objectFactory.createUpdateMXISWOCHANGEType();
        update.setMXISWOCHANGESet(changeSet);

        return update;
    }

    private String buildImplDescription(BuildInfo buildInfo) {
        String description = String.format(
                maximoChangeRequestConfig.getImplDescription(),
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

    private MXDateTimeType createMXDateTimeType(Date date) throws DatatypeConfigurationException {
        MXDateTimeType mxDateType = objectFactory.createMXDateTimeType();
        XMLGregorianCalendar calendar = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(
                        GregorianCalendar.from(ZonedDateTime.from(date.toInstant().atZone(ZoneId.systemDefault())))
                );
        mxDateType.setValue(calendar);
        return mxDateType;
    }

    private JAXBElement<MXDateTimeType> createSCHEDSTARTAsJAXBElement(Date date) throws DatatypeConfigurationException {
        return objectFactory.createMXISWOCHANGEWOACTIVITYTypeSCHEDSTART(createMXDateTimeType(date));
    }

    private JAXBElement<MXDateTimeType> createSCHEDFINISHAsJAXBElement(Date date) throws DatatypeConfigurationException {
        return objectFactory.createMXISWOCHANGEWOACTIVITYTypeSCHEDFINISH(createMXDateTimeType(date));
    }

    private MXDomainType createMXDomainType(String value) {
        MXDomainType domainType = objectFactory.createMXDomainType();
        domainType.setValue(value);
        return domainType;
    }
}
