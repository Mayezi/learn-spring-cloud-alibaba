package com.mayezi.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigLoadPriorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosConfigLoadPriorityApplication.class, args);
	}

}
