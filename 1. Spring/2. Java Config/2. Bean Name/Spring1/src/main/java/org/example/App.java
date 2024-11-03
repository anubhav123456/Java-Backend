package org.example;


import org.example.computers.Desktop;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop1 = context.getBean("desktop1", Desktop.class);
        desktop1.compile();

        Desktop desktop2 = context.getBean("dt", Desktop.class);
        desktop2.compile();

        Desktop desktop3 = context.getBean("dtop", Desktop.class);
        desktop3.compile();



    }
}
