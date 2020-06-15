package com.example.provider.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyuanqiang
 * @date 2020/6/12
 */
@RestController
@RequestMapping("/api")
public class FeignController {
    @Value("${server.port}")
    String port;

//    @Override
    @GetMapping("/sayHi")
    public String sayHiFromClientOne(@RequestParam(value = "name") String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
