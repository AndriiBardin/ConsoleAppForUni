package com.example.botscrew.controller;

import com.example.botscrew.service.LectorService;
import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class GlobalSearchHandler implements UserInputHandler {
    private LectorService lectorService;

    public GlobalSearchHandler(LectorService lectorService) {
        this.lectorService = lectorService;
    }

    @Override
    public void command(String command) {
        if (command.equals("search")) {
            System.out.println("type your search request");
            Scanner scanner = new Scanner(System.in);
            String request = scanner.nextLine();
            lectorService.getAllLectors().stream()
                    .filter(lector -> lector.getName().contains(request))
                    .forEach(lector ->
                            System.out.println("========================================="
                                    + "=============="
                                    + "\n" + "RESULT " + lector.getName()));
        }
    }
}
