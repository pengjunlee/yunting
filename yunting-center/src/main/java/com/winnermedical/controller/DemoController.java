package com.winnermedical.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjunlee
 * @create 2020-04-28 16:19
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/msg/get")
    public String getMsg() {
        return "hello!";
    }

}
