package com.ss.springcloudconsumer.feign.hystrix;

import com.ss.springcloudconsumer.feign.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wsy
 * \* Date: 2017/10/5
 * \* Time: 17:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "error";
    }
}