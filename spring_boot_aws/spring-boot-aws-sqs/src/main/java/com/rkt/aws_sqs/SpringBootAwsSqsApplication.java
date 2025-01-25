package com.rkt.aws_sqs;

import io.awspring.cloud.sqs.annotation.SqsListener;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * A sample application to demonstrate sending simple message to SQS and receiving message from SQS.
 * <p>
 * To run this sample application, you need to do either of the following.
 * <ul>
 * <li>If you wish to send/receive messages using SQS, you need to create a queue in SQS in AWS Console
 * <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/welcome.html">.</li>
 * <li>If you wish to just test out sending/receiving capability in a test environment, you can do so by running localstack.
 * Just issue the following command from the root of the `spring-boot-aws-sqs`:
 *
 * <pre>
 * docker-compose -f docker-compose.yml up -d
 * </pre>
 *
 * See more information on localstack see <a href="https://docs.localstack.cloud/getting-started/">here</a> and
 * <a href="https://docs.localstack.cloud/user-guide/aws/sqs/">here</a>.</li>
 * </ul>
 * </p>
 *
 */
@SpringBootApplication
public class SpringBootAwsSqsApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAwsSqsApplication.class);

	private static final String QUEUE_NAME = "my-sample-queue";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsSqsApplication.class, args);
	}

	@SqsListener(queueNames = QUEUE_NAME)
	void listen(SampleRecord message) {
		LOGGER.info("Received message {} {}", message.propertyOne(), message.propertyTwo());
	}

	@Bean
	public ApplicationRunner sendMessageToQueue(SqsTemplate sqsTemplate) {
		return args -> sqsTemplate.send(QUEUE_NAME, new SampleRecord("Hello!", "From SQS!"));
	}

	private record SampleRecord(String propertyOne, String propertyTwo) {
	}
}
