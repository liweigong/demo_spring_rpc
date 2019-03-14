package org.liweigong.spring.rpc.entity;

import java.io.Serializable;

/**
 * @author xiaoming.kang
 * @date 2019/03/14.
 */
public class Person implements Serializable{

    private String name;

    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
