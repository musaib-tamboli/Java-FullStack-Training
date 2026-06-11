package org.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello world");
        @SuppressWarnings("resource")
        ApplicationContext cont = new ClassPathXmlApplicationContext("classpath:config.xml");
        Customer customer = (Customer) cont.getBean("cust1");


        System.out.println(customer);
    }
}