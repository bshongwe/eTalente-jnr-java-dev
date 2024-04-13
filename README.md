# eTalente-jnr-java-dev
eTalente Interview Assessment

# Proposed API Documentation: (plan)

# File Upload API

This is a Spring Boot application that provides a RESTful API for uploading files. The API allows clients to securely upload files, with added features such as basic authentication, file size validation, and Docker deployment.

## Features
-   **RESTful API:** <i>Provides endpoints for file upload operations.</i>
-   **Basic Authentication:** <i>Secures the API with basic authentication using Spring Security.</i>
-   **File Size Validation:** <i>Validates uploaded file size to ensure it does not exceed a specified limit.</i>
-   **Docker Deployment:** <i>Includes Docker support for containerized deployment.</i>
-   **AWS Deployment:** <i>Ready for deployment to AWS Elastic Beanstalk.</i>

## Usage

### Prerequisites

-   Java Development Kit (JDK) 11 or higher
-   Maven
-   For deployment:
    -   Docker
    -   AWS CLI

### Running the Application

1. Clone this repository:

   ```bash
   git clone https://github.com/bshongwe/eTalente-jnr-java-dev.git
   ```

2. Navigate to the project directory:

   ```bash
   cd eTalente-jnr-java-dev
   ```

3. Build the application using Maven:

   ```bash
   mvn clean package
   ```

4. Run the application:

   ```bash
   java -jar target/eTalente-jnr-java-dev-1.0.0.jar
   ```

   Alternatively, you can run it using Maven:

   ```bash
   mvn spring-boot:run
   ```


### Uploading a File

Send a POST request to the `/api/upload` endpoint with a file attached. You can use tools like cURL, Postman, or any HTTP client library.

Example using cURL:

```bash
curl -X POST -F "file=@/<path>/file.txt" http://localhost:8080/api/upload
```

### Responses

- If the file is uploaded successfully, you will receive a `200 OK` response with a success message.
- If there is an error during the upload process (e.g., invalid file, file processing error), you will receive an appropriate error response.

### Error Handling

The application handles errors gracefully and returns meaningful error messages for invalid requests, file processing errors, and other exceptional conditions.

### Logging

API requests, responses, and errors are logged for monitoring and troubleshooting purposes.

# Implemetations
-   <strong>File Upload Endpoint:</strong> <i>We have implemented a POST endpoint /api/upload to accept file uploads.</i>
-   <strong>Error Handling:</strong> <i>We have implemented a global exception handler to handle exceptions gracefully, with a specific handler for handling file size limit exceeded exceptions.</i>
-   <strong>Logging:</strong> <i>We have configured logging to capture API requests, responses, and errors for monitoring and troubleshooting purposes.</i>
-   <strong>Testing:</strong> <i>We have added unit tests to ensure the functionality of the controller class.</i>
-   <strong>API Prep for Deployment:</strong> <i>authentication, file size validation, API documentation</i>

# Deployment

   ```bash
   mvn spring-boot:run
   ```

#### Docker Deployment

1. Build the Docker image:

   ```bash
   cd deployment/docker
   ./build.sh
   ```

2. Run the Docker container:

   ```bash
   ./run.sh
   ```

#### AWS Deployment

1. Ensure you have configured AWS CLI with appropriate credentials.

2. Run the deployment script:

   ```bash
   cd deployment/aws
   ./deploy.sh
   ```

### API Documentation

The API documentation can be accessed using Swagger UI. Once the application is running, navigate to `http://localhost:8080/swagger-ui.html` in your web browser to view the API documentation.

### Error Handling

The application handles errors gracefully and returns meaningful error messages for invalid requests, file processing errors, and other exceptional conditions.

### Logging

API requests, responses, and errors are logged for monitoring and troubleshooting purposes.

## Contributing

Contributions are welcome! If you have any suggestions or find any issues, please feel free to open an issue or submit a pull request.


