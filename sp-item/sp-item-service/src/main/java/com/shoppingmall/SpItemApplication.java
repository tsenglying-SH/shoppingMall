package com.shoppingmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SpItemService
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/4 16:27
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient/*注册到eureka中*/
public class SpItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpItemApplication.class);
    }
}
