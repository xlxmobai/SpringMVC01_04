package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

   @RequestMapping(path = "/hello")
    public String sayhello(){
        System.out.println("hello");
        return "success";
    }
}
