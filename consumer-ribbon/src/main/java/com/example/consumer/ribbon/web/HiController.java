package com.example.consumer.ribbon.web;

import com.example.consumer.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyuanqiang
 * @date 2020/6/12
 */
@RestController
public class HiController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiService(name);
    }

}
