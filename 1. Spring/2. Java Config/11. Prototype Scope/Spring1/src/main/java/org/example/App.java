package org.example;


import org.example.computers.Alien;
import org.example.computers.Desktop;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien1 = context.getBean(Alien.class);
        alien1.setAge(25);
        System.out.println("Alien age: " + alien1.getAge());
        alien1.code();

        Alien alien2 = context.getBean(Alien.class);
        alien2.setAge(25);
        System.out.println("Alien age: " + alien2.getAge());
        alien2.code();

    }
}
