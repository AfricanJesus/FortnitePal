package com.africanjesus.fortnitepal.controllers;

import com.africanjesus.fortnitepal.services.S3Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



@Controller
public class FileController {

    @Autowired
    S3Service s3Service;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/api/file/upload")
    public ResponseEntity<?> uploadMultipartFile(@RequestParam("keyname") String keyName, @RequestParam("foldername") String folderName, @RequestParam("uploadfile") MultipartFile file) {
        s3Service.uploadFile(keyName, folderName, file);
        return new ResponseEntity("Upload Complete", HttpStatus.CREATED);
    }


}
