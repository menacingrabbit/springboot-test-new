package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
    //@GetMapping("/")
//    public String hello() {
//        return "Hello, World!";
//    }
}
