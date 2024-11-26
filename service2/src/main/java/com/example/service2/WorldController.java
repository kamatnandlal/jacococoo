package com.example.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    @GetMapping("/service2/world")
    public String sayHello() {
        return "Hello from Service 2!";
    }
}
