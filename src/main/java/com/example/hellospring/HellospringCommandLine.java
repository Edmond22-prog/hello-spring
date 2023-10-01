package com.example.hellospring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HellospringCommandLine implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Spring Boot!");
    }
}
