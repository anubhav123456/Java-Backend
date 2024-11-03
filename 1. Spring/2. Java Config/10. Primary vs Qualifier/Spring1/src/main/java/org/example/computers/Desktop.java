package org.example.computers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtop")
@Primary
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