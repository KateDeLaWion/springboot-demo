package com.MySpringBootDemo.SpringBootDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        // Run this main function to work the class Employee
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:data.xml");

        Employee emp1 = context.getBean("employee1", Employee.class);

        System.out.println("Employee Details " + emp1);

    }
}
