package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by fxf on 2017/11/11.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
