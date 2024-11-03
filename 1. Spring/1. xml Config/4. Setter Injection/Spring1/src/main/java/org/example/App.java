package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //1. Creates Spring IOC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Allien allien = (Allien) context.getBean("allien");
        System.out.println(allien.getAge());
    }
}
//Allien object created
//Allien setter called.
//21