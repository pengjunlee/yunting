package com.winnermedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengjunlee
 * @create 2020-04-28 15:20
 */

@SpringBootApplication
@EnableEurekaClient
public class YunTingCenter {
    public static void main(String[] args) {
        SpringApplication.run(YunTingCenter.class, args);

    }
}
