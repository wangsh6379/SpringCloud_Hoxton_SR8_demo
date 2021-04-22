package com.wangsh.controller;

import com.wangsh.entity.Dept;
import com.wangsh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope //增加此注解后可实现自动更新配置文件，从nacos中获取配置
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return deptService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    //Eureka做服务发现
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept/eureka")
    public String eureka_dis() {
        List<String> services = client.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = client.getInstances(service);
            for(ServiceInstance serviceInstance :instances){
                System.out.println(serviceInstance.getUri() + "====================" + service);
            }
        }
        return null;
    }

    @Value("${name}")
    private String name;
    @GetMapping("/nacos/get")
    public String getName(){
        return name;
    }
}
