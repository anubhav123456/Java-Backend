package org.example.computers;

import org.springframework.stereotype.Component;

@Component("ltop")
public class Laptop implements Computer
{
    public Laptop()
    {
        System.out.println("Laptop object created");
    }
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}
