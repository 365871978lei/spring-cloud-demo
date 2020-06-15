package com.example.provider.server.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author leiyuanqiang
 * @date 2020/6/12
 */
@FeignClient(value = "provider-a", contextId = "FeignApi", primary = true, path="/api")
public interface FeignApi {

    @GetMapping("/sayHi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
