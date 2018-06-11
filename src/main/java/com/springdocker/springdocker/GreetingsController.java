package com.springdocker.springdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello to you too";
    }
}
