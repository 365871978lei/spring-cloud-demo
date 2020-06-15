package com.example.consumer.feign.web;

import com.example.consumer.feign.api.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyuanqiang
 * @date 2020/6/12
 */
@RestController
public class HiController {

    @Autowired
    FeignApi feignApi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignApi.sayHiFromClientOne( name );
    }

}
