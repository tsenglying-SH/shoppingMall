package com.shoppingmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SpUploadApplication
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/10 20:09
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpUploadApplication.class);
    }
}
