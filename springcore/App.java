package com.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Car obj = (Car)context.getBean("car");
       obj.drive();
       //Vehicle obj1 = (Vehicle)context.getBean("car");
       //obj1.drive();

       //Tyre t = (Tyre) context.getBean("tyre");
       //System.out.println(t);
    }
}
