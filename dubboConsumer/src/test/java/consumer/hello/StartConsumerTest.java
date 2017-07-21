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
            System.out.println("1234567");
            System.out.println("211314");
            System.out.println("12333333333");
            System.out.println("我是一个兵");
            System.out.println("操作错误");
            System.out.println("最后一次，太浪费时间了");
            System.out.println("命令行");
            System.out.println("terminal测试");
            System.out.println("terminal郁闷");
            System.out.println("吃葡萄不吐葡萄皮儿");
            System.out.println("吃葡萄不吐葡萄皮儿吗");
            System.out.println("吃葡萄不吐葡萄皮儿吗");
            System.out.println("变化");
            System.out.println("变化");
            System.out.println("需要隐藏的分支");
            System.out.println("需要隐藏的分支2");
            System.out.println("不需要隐藏的分支4");
            System.out.println("需要隐藏的分支3");
            String shiyan=helloService.sayHello();
            System.out.println(shiyan);

        }
    }

