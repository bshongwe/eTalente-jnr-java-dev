# eTalente-jnr-java-dev
eTalente Interview Assessment

# Proposed API Documentation: (plan)

# File Upload API

This is a Spring Boot application that provides a RESTful API for uploading files.

## Usage

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven

### Running the Application

1. Clone this repository:

   ```bash
   git clone https://github.com/bshongwe/eTalente-jnr-java-dev.git
   ```

2. Navigate to the project directory:

   ```bash
   cd file-upload-api
   ```

3. Build the application using Maven:

   ```bash
   mvn clean package
   ```

4. Run the application:

   ```bash
   java -jar target/file-upload-api-1.0.0.jar
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
