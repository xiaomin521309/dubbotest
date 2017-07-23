package consumer.hello;

import hello.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Asus on 2017/7/17.
 */
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations ="classpath:dubbo-consumer.xml")
   public class StartConsumerTest {

@Autowired
        private HelloService helloService;

        @Test
        public void test(){
            System.out.println("dubbo-consumer服务启动，调用！");
            String shiyan=helloService.sayHello();
            System.out.println(shiyan);

        }
    }

