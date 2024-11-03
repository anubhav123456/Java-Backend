package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //1. Creates Spring IOC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Allien allien1 = (Allien) context.getBean("allien");
        allien1.code();

        Allien allien2 = (Allien) context.getBean("allien");
        allien2.code();
    }
}
//Allien object created
//Coding
//Coding

//Clearly Spring Ioc container follows the Singleton design pattern