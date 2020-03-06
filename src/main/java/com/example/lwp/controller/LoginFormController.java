package com.example.lwp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFormController {
    @RequestMapping("/index")
    public String indexForm(){
        System.out.println("request mapping index");
        return "index";
    }
    @RequestMapping("/login")
    public String loginForm(){
        System.out.println("request mapping login");
        return "login";
    }
}
