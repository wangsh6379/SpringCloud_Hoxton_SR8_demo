package com.wangsh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDeptNacos8007Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptNacos8007Application.class, args);
    }



    @RestController
    class EchoController {
        @RequestMapping(value = "/dept/{string}", method = RequestMethod.GET)
        public String echo(@PathVariable String string) {
            return string;
        }

        @Value("${spring.datasource.password}")
        private String pass;
        @RequestMapping(value = "/dept2/{string}", method = RequestMethod.GET)
        public String echo2(@PathVariable String string) {
            return string+"==="+pass;
        }
    }
}
