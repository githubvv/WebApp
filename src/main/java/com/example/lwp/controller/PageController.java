package com.example.lwp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RestController
public class PageController {

//    MessageSource messageSource;
//
//    @Autowired
//    public PageController(MessageSource messageSource) {
//        this.messageSource = messageSource;
//    }

    @RequestMapping("/test")
//    public String indexPage() {
//    public String indexPage(Map<String, Object> model) {
    public String indexPage() {
        System.out.println("controller test");
        //LocaleContextHolder.setLocale(new Locale("uk", "UA"));
        //model.put("message", messageSource.getMessage("welcome.message", null, LocaleContextHolder.getLocale()));
        //return messageSource.getMessage("welcome.message", null, LocaleContextHolder.getLocale());
        return "index.html";
    }




}
