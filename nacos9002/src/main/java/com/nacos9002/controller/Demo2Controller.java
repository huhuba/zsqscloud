package com.nacos9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zsq")//路由路径
public class Demo2Controller {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/get")
    public String getServerPort() {
        return "库存-1" + serverPort;
    }
    @GetMapping(value = "/get1")
    public  String getServerPort2(){
        return  "hello  nacos Discovery:"+serverPort;
    }

}