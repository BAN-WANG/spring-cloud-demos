package com.ss.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wsy
 * \* Date: 2017/10/9
 * \* Time: 15:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
@RefreshScope
class HelloController {
    @Value("${ss.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String getHello() {
        return this.hello;
    }
}