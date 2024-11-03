package com.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args)
    {
        ApplicationContext context =  SpringApplication.run(SpringBootAppApplication.class, args);
        Allien allien = context.getBean(Allien.class);
        allien.code();
    }

}
