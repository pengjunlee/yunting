package com.winnermedical.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pengjunlee
 * @create 2020-04-28 16:46
 */
@FeignClient(name = "yunting-center", fallback = DemoServiceFallback.class)
public interface DemoServiceFeign {

    @GetMapping("/demo/msg/get")
    String getMsg();

}
