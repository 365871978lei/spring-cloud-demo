package com.example.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyuanqiang
 * @date 2020/6/15
 */

@RestController
@RequestMapping("/config")
public class ConfigClientController {
    @Value("${hello}")
    private String hello;

    @GetMapping("/getConfigHello")
    public String getConfigHello() {
        return hello;
    }

}
