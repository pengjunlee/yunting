package com.winnermedical.controller;

import com.winnermedical.service.DemoServiceFeign;
import com.winnermedical.service.DemoServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pengjunlee
 * @create 2020-04-28 17:06
 */
@RestController
@RequestMapping("/yunting")
public class YunTingController {

    @Resource
    private DemoServiceFeign demoService;

    @GetMapping("/msg/get")
    public Object getMsg() {

        return demoService.getMsg();

    }
}
