#!/bin/bash

# Navigate to deployment/docker directory
cd ../deployment/docker

# Build Docker image
docker build -t eTalente-jnr-java-dev .
