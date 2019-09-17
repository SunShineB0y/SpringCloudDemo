package com.demo.xyptservice.service;

import org.springframework.stereotype.Service;

/**
 * @author maozd
 * @date 2019/9/14 14:58
 */
@Service
public class HelloService {

    public String testHello(String name) throws Exception {

        System.out.println("服务启动！");
        return "hello " + name + "! This is a Spring Boot Demo!";
    }
}
