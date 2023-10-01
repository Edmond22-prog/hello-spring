package com.example.hellospring.model;

public class HelloSpringBoot {
    String value = "Hello Spring Boot !";

    /**
     * Voici donc comment on fait la docstring d'une methode ^^ .
     * Donc cette methode sera appellé automatiquement lorsque l'on 
     * affichera une instance de la classe HelloSpringBoot.
     * 
     */
    public String toString() {
        return value;
    }
}
