package com.shopdirect.maximoautomation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.shopdirect.maximoautomation.infrastructure.config.MaximoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication(scanBasePackages = { "com.shopdirect", "com.shopdirect.maximoautomation" })
@Import(MaximoConfiguration.class)
@EnableCircuitBreaker
public class ServiceApplication {

	@Bean
	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
		return new Jackson2ObjectMapperBuilder() {
			@Override
			public void configure(ObjectMapper objectMapper) {
				super.configure(objectMapper);
				objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
					.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
					.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false)
					.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
					.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
					.configure(SerializationFeature.INDENT_OUTPUT, true)
					.setNodeFactory(JsonNodeFactory.withExactBigDecimals(true))
					.setDateFormat(new ISO8601DateFormat());
			}
		};
	}

	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
		CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
		loggingFilter.setIncludeClientInfo(true);
		loggingFilter.setIncludeQueryString(true);
		loggingFilter.setIncludePayload(true);
		loggingFilter.setIncludeHeaders(false);
		return loggingFilter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
