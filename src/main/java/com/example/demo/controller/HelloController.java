package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello there !!!!!!!!!!!!!!!!";
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String sayBye() {
        return "Bye folks, c u you soon !!!!!!!!!!!!!!!!!!";
    }
}
