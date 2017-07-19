package hello.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Asus on 2017/7/17.
 */
public class StartProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.print("这里是提供方按任意键退出");
        try{
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
