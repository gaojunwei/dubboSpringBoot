package com.jack.dubbo.demo.resource;

import com.jack.dubbo.demo.UserServiceResource;

public class DemoServiceImpl implements UserServiceResource {
    @Override
    public String doWork(String param) {
        System.out.println("服务提供者 收到消息："+param);
        return "OK";
    }
}
