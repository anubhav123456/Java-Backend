package org.example.config;

import org.example.computers.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Desktop desktop1()
    {
        return new Desktop();
    }

    @Bean( name = "dt")
    public Desktop desktop2()
    {
        return new Desktop();
    }

    @Bean( name = { "dest", "dtop", "desktop"})
    public Desktop desktop3()
    {
        return new Desktop();
    }
}
