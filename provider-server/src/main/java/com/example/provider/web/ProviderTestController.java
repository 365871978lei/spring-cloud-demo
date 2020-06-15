package com.example.provider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyuanqiang
 * @date 2020/6/12
 */
@RestController
public class ProviderTestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "this is default value") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
