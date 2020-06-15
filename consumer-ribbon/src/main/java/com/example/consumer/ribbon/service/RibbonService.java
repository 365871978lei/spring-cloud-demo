package com.example.consumer.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author leiyuanqiang
 * @date 2020/6/12
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiSweviceError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://provider-a/hi?name=" + name, String.class);
    }

    public String hiSweviceError(String name){
        return "hi," + name + ",断路机制启动，hiServiceError";
    }

}
