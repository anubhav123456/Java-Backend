package org.example.springbootapp;

import org.example.springbootapp.computers.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(SpringBootAppApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        System.out.println("Alien age is " + alien.getAge());
        alien.code();
    }

}
