package com.shoppingmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName SpRegistry
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/4 15:08
 * @Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class SpRegistry {
    public static void main(String[] args) {
        SpringApplication.run(SpRegistry.class);
    }
}
