package com.sentinel8401.zsqcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/testA")
    public  String  testA(){
        return  "-----testA";
    }
    @GetMapping("/testB")
    public  String  testb(){
        return  "-----testb";
    }
}
