package org.example.config;

import org.example.computers.Alien;
import org.example.computers.Computer;
import org.example.computers.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Alien alien( @Autowired Computer computer)
    {
        Alien alien = new Alien();
        alien.setAge(25);
        alien.setComputer(computer);
        return alien;
    }

    @Bean
    public Desktop desktop()
    {
        return new Desktop();
    }
}
