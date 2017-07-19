package hello.service.impl;

import hello.service.HelloService;

/**
 * Created by Asus on 2017/7/17.
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(){
      System.out.print("这里是提供者");
       System.out.print("Hello Provider");
        String ceshi="我是";
        return ceshi;
    }
}
