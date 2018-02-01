package com.shopdirect.maximoautomation.infrastructure.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories("com.shopdirect.maximoautomation.infrastructure.repository")
public class DynamoDBConfig {

    public static final String BUILDS_TB = "BUILDS_TB";

    @Bean
    public AmazonDynamoDB amazonDynamoDB(@Value("${amazon.dynamodb.endpoint}") String endpoint,
                                         @Value("${amazon.dynamodb.region}") String region
                                         /*AWSCredentials amazonAWSCredentials*/) {
        return AmazonDynamoDBClientBuilder.standard()
//                .withCredentials(new AWSStaticCredentialsProvider(amazonAWSCredentials))
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint + "/" + BUILDS_TB, region))
                .build();
    }

//    @Bean
//    public AWSCredentials amazonAWSCredentials(@Value("${amazon.aws.accesskey}") String awsAccessKey,
//                                               @Value("${amazon.aws.secretkey}") String awsSecretKey) {
//        return new BasicAWSCredentials(awsAccessKey, awsSecretKey);
//    }
}
