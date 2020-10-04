package com.shoppingmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName SpGateway
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/10/4 15:23
 * @Version 1.0
 **/
@EnableZuulProxy
@SpringCloudApplication/*自带三个注解*/
public class SpGateway {
    public static void main(String[] args) {
        SpringApplication.run(SpGateway.class);
    }
}
