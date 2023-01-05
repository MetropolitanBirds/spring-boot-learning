package com.atguigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }

}
