#!/bin/bash

# Navigate to the deployment/docker directory
cd ../deployment/docker

# Build the Docker image
docker build -t file-upload-api .
