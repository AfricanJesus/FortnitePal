package com.africanjesus.fortnitepal.services;

import org.springframework.web.multipart.MultipartFile;

public interface S3Service {
    void uploadFile(String keyName, String folderName, MultipartFile file);
}
