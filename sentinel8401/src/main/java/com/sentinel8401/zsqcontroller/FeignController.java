package com.sentinel8401.zsqcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignClients  feignClients;

    @GetMapping(value = "feign/{id}")
    public String getInfo(@PathVariable("id") Long id){
            return feignClients.getServerPort();
    }
}
