#!/bin/bash

# Zips project files
zip -r eTalente-jnr-java-dev.zip ./*

# Deploys to AWS Elastic Beanstalk
aws elasticbeanstalk create-application-version \
  --application-name eTalente-jnr-java-dev \
  --version-label eTalente-jnr-java-dev-v1 \
  --source-bundle S3Bucket=<s3-bucket-ID>,S3Key=eTalente-jnr-java-dev.zip

aws elasticbeanstalk update-environment \
  --application-name eTalente-jnr-java-dev \
  --environment-name your-environment-name \
  --version-label eTalente-jnr-java-dev-v1

