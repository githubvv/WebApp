package com.example.lwp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping//("/")
public class LoginFormController {

    @RequestMapping("/*")
//    public void loginForm(){
    public String loginForm(){
        System.out.println("request mapping def");
        return "index.html";
    }

}
