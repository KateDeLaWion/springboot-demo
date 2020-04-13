package com.MySpringBootDemo.SpringBootDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myMainApp {

    public static void main(String[] args) {

       // Run this main function to the class HelloWorld
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("data.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
        
    }

}
