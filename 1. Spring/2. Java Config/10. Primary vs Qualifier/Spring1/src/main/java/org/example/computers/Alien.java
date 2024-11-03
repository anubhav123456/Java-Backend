package org.example.computers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//3. Constructor Injection
@Component
public class Alien
{
    private int age;
    @Autowired
    @Qualifier("ltop")
    //Field Injection
    private Computer computer;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Computer getComputer()
    {
        return computer;
    }

    //Setter Injection
    public void setComputer(Computer computer)
    {
        this.computer = computer;
    }

    public void code()
    {
        computer.compile();
    }
}
