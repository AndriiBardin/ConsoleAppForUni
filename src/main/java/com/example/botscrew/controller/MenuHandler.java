package com.example.botscrew.controller;

import org.springframework.stereotype.Component;

@Component
public class MenuHandler {

    public void menu() {
        System.out.println("=======================================================");
        System.out.println("AVAILABLE COMMANDS");
        System.out.println("head of department - returns head of department");
        System.out.println("count - returns amount of lectors in department");
        System.out.println("count by degree - returns amount of lectors with degree");
        System.out.println("salary - returns average salary of the department");
        System.out.println("search - returns partial match of lectors name");
        System.out.println("quit - exits the program");
        System.out.println("=======================================================");
    }
}
