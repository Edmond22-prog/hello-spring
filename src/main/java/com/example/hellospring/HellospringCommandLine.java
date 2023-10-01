package com.example.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.hellospring.model.HelloSpringBoot;
import com.example.hellospring.service.BusinessService;

@Component
public class HellospringCommandLine implements CommandLineRunner {
    @Autowired
    private BusinessService bs;
    
    @Override
    public void run(String... args) throws Exception {
        /*
         * On récupère un objet de type HelloSprintBoot via la classe BusinessService
         * puis on passe cette instance dans le println.
         */
        HelloSpringBoot hsb = bs.getHelloSprintBoot();
        System.out.println(hsb);
    }
}
