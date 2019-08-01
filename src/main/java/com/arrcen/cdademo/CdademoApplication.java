package com.arrcen.cdademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

@SpringBootApplication
public class CdademoApplication {
	@Bean
	PageableHandlerMethodArgumentResolverCustomizer pageableResolverCustomizer() {
		return pageableResolver -> pageableResolver.setOneIndexedParameters(true);
	}

	public static void main(String[] args) {
		SpringApplication.run(CdademoApplication.class, args);
	}

}
