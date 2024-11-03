package org.example.config;

import org.example.computers.Alien;
import org.example.computers.Computer;
import org.example.computers.Desktop;
import org.example.computers.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig
{
    @Bean
    public Alien alien(Computer computer)
    {
        Alien alien = new Alien();
        alien.setAge(25);
        alien.setComputer(computer);
        return alien;
    }

    @Bean
    @Primary
    public Desktop desktop()
    {
        return new Desktop();
    }

    @Bean
    public Laptop laptop()
    {
        return new Laptop();
    }
}
