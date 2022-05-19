package com.sentinel8401.zsqcontroller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "nacos-provider")
public interface FeignClients {
    @GetMapping(value = "/zsq")
    String getServerPort();


}
