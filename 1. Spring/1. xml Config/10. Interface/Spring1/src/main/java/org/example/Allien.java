package org.example;

public class Allien
{
    private int age;
    private Computer computer;

    public Computer getComputer()
    {
        return computer;
    }

    public void setComputer(Computer computer)
    {
        this.computer = computer;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        System.out.println("Allien setter called.");
        this.age = age;
    }

    public Allien()
    {
        System.out.println("Allien object created");
    }

    public void code()
    {
        System.out.println("Coding");
        computer.compile();
    }
}
