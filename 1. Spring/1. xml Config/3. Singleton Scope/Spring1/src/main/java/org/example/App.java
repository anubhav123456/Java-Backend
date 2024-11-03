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
        allien1.age = 15;

        System.out.println(allien1.age);

        Allien allien2 = (Allien) context.getBean("allien");
        allien2.code();
        System.out.println(allien2.age);
    }
}
//Allien object created
//Coding
//15
//Coding
//15