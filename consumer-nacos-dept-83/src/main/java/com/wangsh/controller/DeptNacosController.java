package com.wangsh.controller;

import com.wangsh.entity.Dept;
import com.wangsh.service.DeptFeignService;
import com.wangsh.service.DeptNacosFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 使用Feign来获取API中的的Provider的服务
 */
@RestController
public class DeptNacosController {

    @Autowired
    private DeptNacosFeignService deptNacosFeignService;

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {

        return deptNacosFeignService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptNacosFeignService.list();
    }

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptNacosFeignService.add(dept);
    }

}
