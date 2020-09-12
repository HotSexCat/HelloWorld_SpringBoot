package com.lzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Hello")
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        String str = "helloWorld";
        return "hello world!!";
    }
}
