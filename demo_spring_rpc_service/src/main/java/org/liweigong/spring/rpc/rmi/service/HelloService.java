package org.liweigong.spring.rpc.rmi.service;

import org.liweigong.spring.rpc.entity.Person;
import org.liweigong.spring.rpc.rmi.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @author xiaoming.kang
 * @date 2019/03/14.
 */
@Service
public class HelloService implements IHelloService {

    public Person hello(String name) {
        Person p = new Person();
        p.setName(name);
        p.setGreeting("hello,"+name);
        return p;
    }
}
