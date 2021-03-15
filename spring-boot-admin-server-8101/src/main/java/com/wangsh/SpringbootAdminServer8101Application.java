package com.wangsh;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注意，由于版本文件。
 * 本次使用的是：
 * SpringCloud Greenwich.SR6 版本
 * SpringBoot 2.1.5.RELEASE版本
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringbootAdminServer8101Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdminServer8101Application.class, args);
	}

}
