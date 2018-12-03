package com.africanjesus.fortnitepal.model;

public class FileNode{
    private String name;

    public FileNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FileNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
