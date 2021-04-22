package com.wangsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDeptNacos8007Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptNacos8007Application.class, args);
    }
}
