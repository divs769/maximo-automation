package com.shopdirect.acceptancetest.configuration;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.shopdirect.acceptancetest"})
public class TestConfiguration {

    public static final String BUILDS_TB = "BUILDS_TB";

    @Bean("testClient")
    public AmazonDynamoDB dynamoDB(@Value("${amazon.dynamodb.endpoint}") String endpoint,
                                   @Value("${amazon.dynamodb.region}") String region) throws Exception {
        AmazonDynamoDBClient client = (AmazonDynamoDBClient) AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region))
                .build();
        return client;
    }

}