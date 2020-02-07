package com.mayezi.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {
    @Value("${name:未配置}")
    private String name;
    @GetMapping("/echo")
    public String echo() {
        return name;
    }
}
