# SpringBoot + AWS SQS using LocalStack

This project demonstrates sending a simple message to the AWS SQS queue and receiving the message from AWS SQS. The application uses <a href="https://docs.awspring.io/spring-cloud-aws/docs/3.3.0-M1/reference/html/index.html">spring-cloud-aws</a> dependency and <a href="https://docs.localstack.cloud/overview/">LocalStack</a> emulator.

LocalStack is a cloud service emulator that runs in a single container on the development environment. With LocalStack, you can run your AWS applications entirely on your local machine without connecting to a remote cloud provider.

### Pre-requisite:
1. You must have Docker desktop or Rancher desktop or a similar tool to run docker-compose.yaml
2. Alternatively, the application can run with actual AWS service.


### Steps:
1. Ensure that <b><i>localstack-script/create-sqs-queue.sh</i></b> has a command to create the required SQS queue. 
2. Run the command: <b><i>docker-compose -f docker-compose.yaml up</i></b> [ This command will pull the LocalStack image, start and configure the AWS SES. ]
3. Run the application.
4. Verify the message received in the console.
