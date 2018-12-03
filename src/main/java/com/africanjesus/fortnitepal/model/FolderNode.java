package com.africanjesus.fortnitepal.model;

import java.util.ArrayList;
import java.util.List;

public class FolderNode {

    private String name;
    private List<FileNode> files;

    public FolderNode(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileNode> getFiles() {
        return files;
    }

    public void setFiles(List<FileNode> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "FolderNode{" +
                "name='" + name + '\'' +
                ", files=" + files +
                '}';
    }
}

