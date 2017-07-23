package consumer.hello;

import hello.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Asus on 2017/7/17.
 */
public class StartConsumer {
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("/dubbo-consumer.xml")
    public class Start {

        @Autowired
        private HelloService helloService;

        @Test
        public void test(){
            System.out.println("dubbo-consumer服务启动，调用！");
            System.out.println("吃葡萄！");
            System.out.println("吃葡萄不吐葡萄皮！");
            helloService.sayHello();

        }
    }
}
