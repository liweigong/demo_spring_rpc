package org.liweigong.spring.rpc.rmi;

import org.liweigong.spring.rpc.entity.Person;

/**
 * @author xiaoming.kang
 * @date 2019/03/14.
 */
public interface IHelloService {

    public Person hello(String name);
}
