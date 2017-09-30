package com.ss.ribbonconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wsy
 * \* Date: 2017/9/30
 * \* Time: 14:16
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("ribbon-consumer")
    public String helloConsumer(String name){
        return restTemplate.getForEntity("http://SPRING-CLOUD-PROVIDER/hello?name={name}",String.class,name).getBody();
    }
}