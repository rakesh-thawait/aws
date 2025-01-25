package com.rkt.spring_boot_aws_parameter_store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAwsParameterStoreApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAwsParameterStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsParameterStoreApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(@Value("${message}") String message, // message is read from the parameter store
										@Value("${spring.app.httpUrl}") String httpUrl) { // httpUrl is read from the application.yaml file
		return args -> {
			LOGGER.info("`message` loaded from the AWS parameter store: {}", message);
			LOGGER.info("`httpUrl` loaded from the properties file: {}", httpUrl);
		};
	}
}
