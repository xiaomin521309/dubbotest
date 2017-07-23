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
            System.out.println("今天什么天气");
            System.out.println("有用有用");
            System.out.println("有用有用");
            System.out.println("有用有用");
            System.out.println("有用有用");
            System.out.println("有用有用");
            System.out.println("我才实操git");
            System.out.println("这是实际操作");
            System.out.println("52130987654321");
            System.out.println("爱党爱军爱人民");
            System.out.println("青龙白虎");
            System.out.println("真的是最后一次");
            System.out.println("再次测试");
            System.out.println("stash");
            String shiyan=helloService.sayHello();
            System.out.println(shiyan);

        }
    }

