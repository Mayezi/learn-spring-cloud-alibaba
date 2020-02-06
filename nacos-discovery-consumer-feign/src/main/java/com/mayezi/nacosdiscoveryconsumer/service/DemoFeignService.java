package com.mayezi.nacosdiscoveryconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "nacos-discovery-provider")
public interface DemoFeignService {
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name);
}
