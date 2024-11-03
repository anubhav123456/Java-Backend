package org.example.config;

import org.example.computers.Alien;
import org.example.computers.Computer;
import org.example.computers.Desktop;
import org.example.computers.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example.computers")

public class AppConfig { }
