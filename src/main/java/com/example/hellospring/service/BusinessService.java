package com.example.hellospring.service;

import org.springframework.stereotype.Component;

import com.example.hellospring.model.HelloSpringBoot;

@Component
public class BusinessService {
    
    public HelloSpringBoot getHelloSprintBoot() {
        return new HelloSpringBoot();
    }

}
