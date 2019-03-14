import org.junit.Test;
import org.liweigong.spring.rpc.entity.Person;
import org.liweigong.spring.rpc.rmi.IHelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaoming.kang
 * @date 2019/03/14.
 */

public class DemoTest {

    @Test
    public void testHello() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rpc_config.xml");

        IHelloService helloService = (IHelloService) applicationContext.getBean("helloService");

        Person person = helloService.hello("abc");

        System.out.println(person.getGreeting());

    }

}
