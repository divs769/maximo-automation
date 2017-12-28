package com.shopdirect.acceptancetest;

import com.shopdirect.acceptancetest.configuration.TestConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@ContextConfiguration(
        classes = TestConfiguration.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
public class CucumberStepsDefinition {
}
