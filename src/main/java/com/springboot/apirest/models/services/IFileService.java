package com.springboot.apirest.models.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

// here we can implement the CRUD contract for our identity
public interface IFileService {
    public Resource load(String fileName) throws MalformedURLException;
    public String copy(MultipartFile file) throws IOException;
    public boolean delete(String fileName);
    public Path getPath(String fileName);
}
