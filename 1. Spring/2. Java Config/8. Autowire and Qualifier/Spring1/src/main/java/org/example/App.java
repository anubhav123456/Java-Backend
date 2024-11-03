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
        Alien alien = context.getBean(Alien.class);
        alien.setAge(25);
        System.out.println("Alien age: " + alien.getAge());
        alien.code();

    }
}
