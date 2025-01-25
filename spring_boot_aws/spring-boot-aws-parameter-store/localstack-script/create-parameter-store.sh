#!/bin/bash
awslocal ssm put-parameter --name "/config/spring/message" --value "welcome" --type "String"
awslocal ssm put-parameter --name "/config/spring/httpUrl" --value "external-service:3030/" --type "String"