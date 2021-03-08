package com.wangsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 服务提供者 8005
 * 集成Hystrix
 */
@SpringBootApplication
//集成Eureka服务注册
@EnableEurekaClient
//开启服务发现
@EnableDiscoveryClient
//对Hystrix熔断机制进行支持
@EnableCircuitBreaker
@EnableHystrix
public class ProviderDeptHystrix8005Application {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDeptHystrix8005Application.class, args);
	}

}
