package com.spring.cloud.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Rest Configuration.
 * 
 * @since 1.0.0 2017年11月22日
 */
@Configuration
public class RestConfiguration {
	
	private final RestTemplateBuilder builder;

	@Autowired
	public RestConfiguration(RestTemplateBuilder builder) {
		this.builder = builder;
	}

	@Bean
	public RestTemplate restTemplate() {
		return builder.build();
	}
	
}
