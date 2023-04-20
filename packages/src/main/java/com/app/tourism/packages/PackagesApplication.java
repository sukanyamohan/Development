package com.app.tourism.packages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient

public class PackagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagesApplication.class, args);
	}

/*	@Bean
	public Docket productApi(){
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.app.management.tourism")).build();
	}*/
}
