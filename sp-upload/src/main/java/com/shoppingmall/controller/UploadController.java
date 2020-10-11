package com.shoppingmall.controller;

import com.shoppingmall.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName UploadController
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/10 20:15
 * @Version 1.0
 **/
@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;
    @PostMapping("image")
    public ResponseEntity<String> uploadImage(@RequestParam("file")MultipartFile file){
        String url=uploadService.uploadImage(file);
        return ResponseEntity.ok(url);
    }

}
