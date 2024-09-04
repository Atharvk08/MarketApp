package com.stockapp.marketApp.Configuration;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		return builder
				.requestFactory(() -> new HttpComponentsClientHttpRequestFactory(httpClient))
				.build();
	}
}
