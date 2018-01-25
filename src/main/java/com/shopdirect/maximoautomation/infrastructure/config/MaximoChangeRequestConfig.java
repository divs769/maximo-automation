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

    @Value("${ciNum}")
    private String ciNum;

    @Value("${changeType}")
    private String changeType;

    @Value("${siteId}")
    private String siteId;

    @Value("${description}")
    private String description;

    @Value("${ownerGroup}")
    private String ownerGroup;

    @Value("${reasonForChange}")
    private String reasonForChange;

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

    public String getCiNum() {
        return ciNum;
    }

    public String getChangeType() {
        return changeType;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerGroup() {
        return ownerGroup;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MaximoChangeRequestConfig{");
        sb.append("probabilityFailure=").append(probabilityFailure);
        sb.append(", impact=").append(impact);
        sb.append(", urgency=").append(urgency);
        sb.append(", classificationID='").append(classificationID).append('\'');
        sb.append(", ciNum='").append(ciNum).append('\'');
        sb.append(", changeType='").append(changeType).append('\'');
        sb.append(", siteId='").append(siteId).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
