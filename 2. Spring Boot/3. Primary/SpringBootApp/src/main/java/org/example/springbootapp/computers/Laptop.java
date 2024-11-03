package org.example.springbootapp.computers;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer
{
    public Laptop()
    {
        System.out.println("Laptop created");
    }

    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}
