package com.shopdirect.maximoautomation.infrastructure.config;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.util.StringUtils;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(dynamoDBMapperConfigRef = "dynamoDBMapperConfig",
        basePackages = "com.shopdirect.maximoautomation.infrastructure.repository")
public class DynamoDBConfig {

    public static final String BUILDS_TB = "BUILDS_TB";

    @Bean
    public AmazonDynamoDB amazonDynamoDB(@Value("${amazon.dynamodb.endpoint}") String endpoint,
                                         @Value("${amazon.dynamodb.region}") String region) {
        AmazonDynamoDBClient client = (AmazonDynamoDBClient) AmazonDynamoDBClientBuilder.standard()
                .withRegion(region)
//                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region))
                .build();
        client.setEndpoint(endpoint);
        return client;
    }

    @Bean
    public DynamoDBMapperConfig dynamoDBMapperConfig(@Value("${amazon.dynamodb.tablePrefix}") String tablePrefix) {
        DynamoDBMapperConfig.Builder builder = new DynamoDBMapperConfig.Builder();
        if(!StringUtils.isNullOrEmpty(tablePrefix)) {
            builder.withTableNameOverride(DynamoDBMapperConfig.TableNameOverride.withTableNamePrefix(tablePrefix));
        }
        return builder.build();
    }
}
