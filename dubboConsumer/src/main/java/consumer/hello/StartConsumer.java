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
            System.out.println("不想谈恋爱！");
            System.out.println("吃不到葡萄说葡萄酸！");
            System.out.println("谈恋爱真累！");
            System.out.println("吃不到葡萄说葡萄酸的都是什么玩意儿！");
            System.out.println("不想谈恋爱！");
            helloService.sayHello();

        }
    }
}
