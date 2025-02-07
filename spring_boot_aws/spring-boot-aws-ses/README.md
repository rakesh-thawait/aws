# SpringBoot + AWS SES using LocalStack

This project demonstrates how to use AWS SES to send emails in SpringBoot application. The application uses <a href="https://docs.awspring.io/spring-cloud-aws/docs/3.3.0-M1/reference/html/index.html">spring-cloud-aws</a> dependency and <a href="https://docs.localstack.cloud/overview/">LocalStack</a> emulator.

LocalStack is a cloud service emulator that runs in a single container on the development environment. With LocalStack, you can run your AWS applications entirely on your local machine without connecting to a remote cloud provider.

If you wish to just test out email sending capability in a test environment, you can do so by running localstack. If you wish to send emails to a real email ID, you need to verify identities as mentioned in
<a href="https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html">the Amazon Simple Email Service docs.</a> After you do that, simply update this sample app with email IDs that you have verified with AWS. 

### Pre-requisite:
1. You must have Docker desktop or Rancher desktop or similar tool to run docker-compose.yaml
2. Alternatively, the application can run with actual AWS service.


### Steps:
1. Run the command: docker-compose -f docker-compose.yaml up [This command will pull the LocalStack image, start and configure the AWS SES.]
2. Run the application.
