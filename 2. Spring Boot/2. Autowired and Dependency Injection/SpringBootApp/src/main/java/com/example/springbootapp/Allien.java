package com.example.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// It means this object will be created in spring IoC container
public class Allien
{
    @Autowired
    // we are saying this object will come from spring IOC container
    private Laptop laptop;

    public void code()
    {
        laptop.compile();
    }
}
