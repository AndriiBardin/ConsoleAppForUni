package com.example.botscrew.controller;

import org.springframework.stereotype.Component;

@Component
public class ExitCommandHandler implements UserInputHandler {
    @Override
    public void command(String command) {
        System.out.println("=======================================================");
        System.out.println("Program has stopped");
        System.out.println("=======================================================");
        System.out.println("Bye!");
        System.exit(0);
    }
}
