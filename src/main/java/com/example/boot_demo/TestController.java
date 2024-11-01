package com.example.boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @GetMapping("/list")
    public List<String> hellolist(){
        return List.of("hello", "world", "list");
    }

}
