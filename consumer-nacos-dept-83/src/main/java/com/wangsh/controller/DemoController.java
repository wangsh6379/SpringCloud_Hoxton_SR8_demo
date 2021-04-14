package com.wangsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 注意：因为已经在API模块中将微服务：provider-dept-nacos-8007 注册进去，所以此处不可以重复注册。
 * 会报错：The bean 'provider-dept-nacos-8007.FeignClientSpecification
 * 所以将代码注释，如果要打开则请将DeptNacosController 代码注释，将pom文件中的API模块去除【注解】
 */
@RestController
public class DemoController {
//    @LoadBalanced
//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//
//    /**
//     * 添加支持Feign
//     */
//    @FeignClient(name = "provider-dept-nacos-8007")
//    interface EchoService {
//        @RequestMapping(value = "/dept/{str}", method = RequestMethod.GET)
//        String dept(@PathVariable("str") String str);
//    }
//
//    @RestController
//    class TestController {
//        @Autowired
//        private RestTemplate restTemplate;
//        @Autowired
//        private EchoService echoService;
//
//        @RequestMapping(value = "/dept-rest/{str}", method = RequestMethod.GET)
//        public String rest(@PathVariable String str) {
//            return restTemplate.getForObject("http://provider-dept-nacos-8007/echo/" + str,
//                    String.class);
//        }
//
//        @RequestMapping(value = "/dept-feign/{str}", method = RequestMethod.GET)
//        public String feign(@PathVariable String str) {
//            return echoService.dept(str);
//        }
//    }
}
