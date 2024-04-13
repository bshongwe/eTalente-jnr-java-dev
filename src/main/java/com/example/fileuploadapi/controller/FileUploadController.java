// Ernest B. Shongwe
package com.example.fileuploadapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
// update after security implementation
import org.springframework.http.HttpStatus;

@RestController
public class FileUploadController {

    @PostMapping("/api/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        // File processing logic with upload-size limit
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file to upload");
        }
	if (file.getSize() > 10 * 1024 * 1024) { // Limit file size to 10MB
            return ResponseEntity.status(HttpStatus.PAYLOAD_TOO_LARGE).body("File size exceeds the limit (10MB)");
        }

        // Simulates file processing
        String fileName = file.getOriginalFilename();
        // Will add more validation and processing logic

        return ResponseEntity.ok("File " + fileName + " uploaded successfully");
    }
}
