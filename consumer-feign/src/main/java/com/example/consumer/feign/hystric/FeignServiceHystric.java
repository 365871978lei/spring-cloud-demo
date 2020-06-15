package com.example.consumer.feign.hystric;

import com.example.consumer.feign.api.FeignApi;
import org.springframework.stereotype.Component;

/**
 * @author leiyuanqiang
 * @date 2020/6/15
 */
@Component
public class FeignServiceHystric implements FeignApi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi," + name + ",断路机制启动，hiServiceError";
    }
}
