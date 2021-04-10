package com.springboot.apirest.models.services;

import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements IFileService {

    private static final String UPLOAD_DIRECTORY = "images";

    @Override
    public Resource load(String fileName) throws MalformedURLException {
        Path filePath = getPath(fileName);
        LoggerFactory.getLogger(this.getClass()).info(filePath.toString());
        Resource resource = null;
        resource = new UrlResource(filePath.toUri());
        if (!resource.exists() && !resource.isReadable()) {
            filePath = Paths.get("src/main/resources/static/images").resolve("generic_not_user.png").toAbsolutePath();
            resource = new UrlResource(filePath.toUri());
            LoggerFactory.getLogger(this.getClass()).info("Setting default image");
        }
        return resource;
    }

    @Override
    public String copy(MultipartFile file) throws IOException {
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename().replace(" ", "");
        Path filePath = getPath(fileName);
        LoggerFactory.getLogger(this.getClass()).info(filePath.toString());
        Files.copy(file.getInputStream(), filePath);
        return fileName;
    }

    @Override
    public boolean delete(String fileName) {
        if (fileName != null && fileName.length() > 0) {
            Path oldFilePath = getPath(fileName);
            File oldFile = oldFilePath.toFile();
            if (oldFile.exists() && oldFile.canRead()) {
                oldFile.delete();
                return true;
            }
        }
        return false;
    }

    @Override
    public Path getPath(String fileName) {
        return Paths.get(UPLOAD_DIRECTORY).resolve(fileName).toAbsolutePath();
    }
}
