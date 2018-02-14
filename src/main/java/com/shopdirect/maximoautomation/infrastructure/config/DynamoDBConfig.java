package com.shopdirect.maximoautomation.infrastructure.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.util.StringUtils.isEmpty;

@Configuration
@EnableDynamoDBRepositories(dynamoDBMapperConfigRef = "dynamoDBMapperConfig",
        basePackages = "com.shopdirect.maximoautomation.infrastructure.repository")
public class DynamoDBConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DynamoDBConfig.class);

    public static final String BUILDS_TB = "BUILDS_TB";

    @Bean
    public AmazonDynamoDB amazonDynamoDB(@Value("${amazon.dynamodb.endpoint}") String endpoint,
                                         @Value("${amazon.dynamodb.region}") String region) {
        LOGGER.info("Initializing DynamoDB Client [ Endpoint: {}, Region: {} ]",endpoint, region);
        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region))
                .build();
    }

    @Bean
    public DynamoDBMapperConfig dynamoDBMapperConfig(@Value("${amazon.dynamodb.tablePrefix}") String tablePrefix) {
        DynamoDBMapperConfig.Builder builder = new DynamoDBMapperConfig.Builder();
        if(!isEmpty(tablePrefix)) {
            LOGGER.info("DynamoDB will use table prefilx [ {} ] ", tablePrefix);
            builder.withTableNameOverride(DynamoDBMapperConfig.TableNameOverride.withTableNamePrefix(tablePrefix));
        }
        return builder.build();
    }
}
