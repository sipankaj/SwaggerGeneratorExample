package com.sipankaj.swaggerex.SwaggerGeneratorExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sipankaj.swaggerex.resources.interfaces;com.sipankaj.swaggerex.SwaggerGeneratorExample")
public class SwaggerGeneratorExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerGeneratorExampleApplication.class, args);
	}

}
