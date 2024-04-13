#!/bin/bash

# Navigate to deployment/docker directory
cd ../deployment/docker

# Build Docker image
docker build -t file-upload-api .
