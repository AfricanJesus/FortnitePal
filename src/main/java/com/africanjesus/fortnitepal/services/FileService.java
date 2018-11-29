package com.africanjesus.fortnitepal.services;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class FileService {


    private Path rootLocation;

    public void store(MultipartFile file, String folderName) {

        rootLocation = Paths.get("src/main/resources/static/images/" + folderName);

        try {
            System.out.println(file.getOriginalFilename());
            System.out.println(rootLocation.toUri());
            Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
        } catch (Exception e) {
            throw new RuntimeException("FAIL!");
        }
    }
}
