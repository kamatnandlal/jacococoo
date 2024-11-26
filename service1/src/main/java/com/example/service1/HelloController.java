package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    @GetMapping("/service1/Hello")
    public String sayHello() {
        return "Hello from Service 1!";
    }
}

