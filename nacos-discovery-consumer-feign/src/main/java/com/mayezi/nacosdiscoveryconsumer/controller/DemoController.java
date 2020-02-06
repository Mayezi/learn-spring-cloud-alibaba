package com.mayezi.nacosdiscoveryconsumer.controller;

import com.mayezi.nacosdiscoveryconsumer.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoFeignService demoFeignService;

    @GetMapping("/echo")
    public String hello(String name) {
        return demoFeignService.hello(name);
    }
}
