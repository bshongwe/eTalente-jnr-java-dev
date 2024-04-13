// Ernest B. Shongwe
// Spring Boot App: Main Entry Point
package com.example.fileuploadapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Enable Swagger2
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FileUploadApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadApiApplication.class, args);
    }
}
