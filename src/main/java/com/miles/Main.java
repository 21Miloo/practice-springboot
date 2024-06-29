package com.miles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication // <-- Le ponemos la Anotacion para indicar que es un proyecto using sprongboot framework

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); // <-- Metodo que inicializa la clase que se correra! (Main)

        System.out.println("Listening...");
    }





}



