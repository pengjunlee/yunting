package com.winnermedical.service;

import org.springframework.stereotype.Component;

/**
 * @author pengjunlee
 * @create 2020-04-28 16:48
 */
@Component
public class DemoServiceFallback implements DemoServiceFeign {
    @Override
    public String getMsg() {
        System.out.println("示意接口调用失败，对其进行降级处理！");
        return "消息接口繁忙，请稍后重试！";
    }
}
