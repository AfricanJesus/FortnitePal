package com.africanjesus.fortnitepal.controllers;

import com.africanjesus.fortnitepal.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UploadController {

    @Autowired
    FileService fileService;

    //@CrossOrigin(origins = "http://localhost:4200") // Call  from Local Angualar
    @PostMapping("/upload/{folderName}")
    public ResponseEntity< String > handleFileUpload(@PathVariable String folderName, @RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            fileService.store(file, folderName);
            message = "You successfully uploaded " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            message = "Fail to upload Profile Picture" + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
        }
    }
}
