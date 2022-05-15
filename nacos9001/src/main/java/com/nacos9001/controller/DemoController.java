package com.nacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${server.port}")
    private  String serverPort;

    @GetMapping(value = "/zsq")
    public  String getServerPort(){
        return  "hello  nacos Discovery:"+serverPort;
    }


}
