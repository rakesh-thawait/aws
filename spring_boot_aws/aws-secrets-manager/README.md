# SpringBoot + AWS Secrets Manager using LocalStack

This project demonstrates how to use AWS secrets manager in SpringBoot application to store the application secrets. The application uses <a href="https://docs.awspring.io/spring-cloud-aws/docs/3.3.0-M1/reference/html/index.html">spring-cloud-aws</a> dependency and <a href="https://docs.localstack.cloud/overview/">LocalStack</a> emulator.

LocalStack is a cloud service emulator that runs in a single container on the development environment. With LocalStack, you can run your AWS applications entirely on your local machine without connecting to a remote cloud provider.

### Pre-requisite:
1. You must have Docker desktop or Rancher desktop or similar tool to run docker-compose.yaml 
2. Alternatively, the application can run with actual AWS service.


## Steps:
1. Run the command: docker-compose docker-compose.yaml up [This command will pull the LocalStack image, start and configure the Secrets Manager service.]
2. Run the application.
3. Verify the secrets read from AWS Secrets manager in the console.
