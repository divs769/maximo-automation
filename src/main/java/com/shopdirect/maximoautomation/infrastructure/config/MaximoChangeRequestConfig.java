package com.shopdirect.maximoautomation.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:maximo/change-request.yml")
@ConfigurationProperties(prefix="change")
public class MaximoChangeRequestConfig {
    @Value("${probabilityFailure}")
    private Long probabilityFailure;

    @Value("${impact}")
    private Long impact;

    @Value("${urgency}")
    private Long urgency;

    @Value("${classificationID}")
    private String classificationID;

    @Value("${changeType}")
    private String changeType;

    @Value("${siteId}")
    private String siteId;

    @Value("${implDescription}")
    private String implDescription;

    @Value("${description}")
    private String description;

    @Value("${reasonForChange}")
    private String reasonForChange;

    @Value("${assetNum}")
    private String assetNum;

    @Value("${location}")
    private String location;

    @Value("${plusPCustomer}")
    private String plusPCustomer;

    public MaximoChangeRequestConfig() {
    }

    public Long getProbabilityFailure() {
        return probabilityFailure;
    }

    public Long getImpact() {
        return impact;
    }

    public Long getUrgency() {
        return urgency;
    }

    public String getClassificationID() {
        return classificationID;
    }

    public String getChangeType() {
        return changeType;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getImplDescription() {
        return implDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public String getAssetNum() {
        return assetNum;
    }

    public String getLocation() {
        return location;
    }

    public String getPlusPCustomer() {
        return plusPCustomer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MaximoChangeRequestConfig{");
        sb.append("probabilityFailure=").append(probabilityFailure);
        sb.append(", impact=").append(impact);
        sb.append(", urgency=").append(urgency);
        sb.append(", classificationID='").append(classificationID).append('\'');
        sb.append(", changeType='").append(changeType).append('\'');
        sb.append(", siteId='").append(siteId).append('\'');
        sb.append(", implDescription='").append(implDescription).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", reasonForChange='").append(reasonForChange).append('\'');
        sb.append(", assetNum='").append(assetNum).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", plusPCustomer='").append(plusPCustomer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
