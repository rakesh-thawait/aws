package com.rkt.awssecretsmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsSecretsManagerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(AwsSecretsManagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AwsSecretsManagerApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(@Value("${firstName}") String firstName, // firstName is read from the secrets
										@Value("${spring.app.lastName}") String lastName) { // lastName is read from the application.yaml file
		return args -> {
			LOGGER.info("`firstName` loaded from the AWS Secret Manager: {}", firstName);
			LOGGER.info("`lastName` loaded from the properties file: {}", lastName);
		};
	}
}
