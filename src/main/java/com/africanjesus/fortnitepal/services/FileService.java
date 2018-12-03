package com.africanjesus.fortnitepal.services;


import com.africanjesus.fortnitepal.model.FileNode;
import com.africanjesus.fortnitepal.model.FolderNode;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


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

    public List<FolderNode> allImagesInDirectory(){
        List<FolderNode> folderNodes = new ArrayList<>();
        File rootLocation = new File("src/main/resources/static/images/");
        File[] folderNames = rootLocation.listFiles();

        for(int i = 0; i < folderNames.length; i++){
            folderNodes.add(new FolderNode(folderNames[i].getName()));
            File[] files = folderNames[i].listFiles();

            for(int k = 0; k < files.length; k++){
                folderNodes.get(i).getFiles().add(new FileNode(files[k].getName()));
            }
        }
        return folderNodes;
    }
}

