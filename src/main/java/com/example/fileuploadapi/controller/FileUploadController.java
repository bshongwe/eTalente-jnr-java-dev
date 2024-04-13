// Ernest B. Shongwe
package com.example.fileuploadapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

    @PostMapping("/api/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        // Your file processing logic here
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file to upload");
        }

        // Simulate file processing
        String fileName = file.getOriginalFilename();
        // Here you can add more validation and processing logic

        return ResponseEntity.ok("File " + fileName + " uploaded successfully");
    }
}
