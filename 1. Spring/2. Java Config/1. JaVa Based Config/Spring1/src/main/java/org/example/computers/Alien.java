package org.example.computers;

public class Alien
{
    private int age;
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

    public void setComputer(Computer computer)
    {
        this.computer = computer;
    }

    public void code()
    {
        computer.compile();
    }
}
