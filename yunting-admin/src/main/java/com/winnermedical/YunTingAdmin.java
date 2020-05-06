package com.winnermedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author pengjunlee
 * @create 2020-04-28 16:29
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class YunTingAdmin {
    public static void main(String[] args) {
        SpringApplication.run(YunTingAdmin.class, args);
    }
}
