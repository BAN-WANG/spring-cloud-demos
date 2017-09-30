package com.ss.springcloudprovider.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);
    
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        LOG.info("/hello,name={}",name);
        return "hello "+name+"，this is first messge";
    }
}
