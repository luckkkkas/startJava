package com.example.meu_primeiro_spring_boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!!";
    }
}
