package org.example;

public class Allien
{
    private int age;
    private Laptop laptop;
    private String name;

    //For compulsory fields we use constructor injection
    public  Allien(int age, Laptop laptop, String name)
    {
        this.age = age;
        this.laptop = laptop;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Laptop getLaptop()
    {
        return laptop;
    }

    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
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
//        System.out.println("Coding");
        laptop.compile();
    }
}
