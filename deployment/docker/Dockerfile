# Uses OpenJDK runtime as base image
FROM openjdk:11-jre-slim

# Sets working directory inside container
WORKDIR /app

# Copies packaged JAR file into container
COPY target/eTalente-jnr-java-dev-1.0.0.jar /app/app.jar

# Exposes port application runs on
EXPOSE 8080

# Specifies command to run application
CMD ["java", "-jar", "app.jar"]

