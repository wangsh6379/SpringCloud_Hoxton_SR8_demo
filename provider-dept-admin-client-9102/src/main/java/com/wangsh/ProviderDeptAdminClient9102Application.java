package com.wangsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者 9102
 * 集成SPRINGBOOT ADMIN 进行监控服务提供
 */
@SpringBootApplication
//集成Eureka服务注册
@EnableEurekaClient
//开启服务发现
@EnableDiscoveryClient
public class ProviderDeptAdminClient9102Application {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDeptAdminClient9102Application.class, args);
	}

}
