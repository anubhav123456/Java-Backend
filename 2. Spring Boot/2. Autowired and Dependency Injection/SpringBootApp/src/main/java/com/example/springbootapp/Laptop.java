package com.example.springbootapp;

import org.springframework.stereotype.Component;

@Component
// It means this object will be created in spring IoC container
public class Laptop
{
    public void compile()
    {
        System.out.println("Compiling");
    }
}
