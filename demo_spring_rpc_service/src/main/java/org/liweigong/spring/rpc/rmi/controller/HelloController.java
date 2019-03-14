package org.liweigong.spring.rpc.rmi.controller;

import org.liweigong.spring.rpc.entity.Person;
import org.liweigong.spring.rpc.rmi.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoming.kang
 * @date 2019/03/14.
 */
@RestController("/")
public class HelloController {

    @Autowired
    IHelloService helloService;

    @RequestMapping("/hello")
    public Person hello(String name) {
        return helloService.hello(name);
    }
}
