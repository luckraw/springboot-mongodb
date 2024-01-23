package com.luckraw.springbootmongodb.service;

import com.luckraw.springbootmongodb.model.entity.Photo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PhotoService {
    String addPhoto(String originalFilename, MultipartFile image) throws IOException;

    Photo getPhoto(String id);
}
