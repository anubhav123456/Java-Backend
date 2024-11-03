package org.example.computers;

import org.springframework.stereotype.Component;

@Component("dtop")
public class Desktop implements Computer
{
    public Desktop()
    {
        System.out.println("Desktop object created");
    }

    public void compile()
    {
        System.out.println("Compiling using Desktop");
    }
}