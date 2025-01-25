#!/bin/bash
awslocal secretsmanager create-secret --region ap-south-1 --name /secret/aws-secrets-manager --secret-string '{"firstName": "Jason", "lastName": "Ray"}'