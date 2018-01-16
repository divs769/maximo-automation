package com.shopdirect.maximoautomation.infrastructure.rest;

import com.shopdirect.maximoautomation.infrastructure.config.RethinkDBConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@ActiveProfiles("test")
public class UnitTestConfig {

    @Bean
    public RethinkDBConnectionFactory connectionFactory() {
        return new RethinkDBConnectionFactory();
    }

}
