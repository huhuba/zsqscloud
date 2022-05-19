package com.sentinel8401.zsqcontroller;

import com.sentinel8401.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @Autowired
    public TestService  testService;
    @GetMapping("/testAA")
    public  String  testA(){
        return  testService.common();
    }
    @GetMapping("/testBB")
    public  String  testb(){
        return  testService.common();
    }

}