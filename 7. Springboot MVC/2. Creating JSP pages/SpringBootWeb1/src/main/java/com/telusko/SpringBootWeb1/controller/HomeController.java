package com.telusko.SpringBootWeb1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController
{
    public String home()
    {
        return "index.jsp";
    }
}
