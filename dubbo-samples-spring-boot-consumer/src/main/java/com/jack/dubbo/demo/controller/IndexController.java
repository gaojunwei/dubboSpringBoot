package com.jack.dubbo.demo.controller;

import com.jack.dubbo.demo.UserServiceResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private UserServiceResource userServiceResource;

    @GetMapping("{msg}")
    public String test(@PathParam("msg") String msg) {
        System.out.println("请求进入");
        String result = userServiceResource.doWork("铁子");
        System.out.println("响应数据:" + result);
        return result;
    }
}
