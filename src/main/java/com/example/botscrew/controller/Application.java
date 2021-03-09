package com.example.botscrew.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class Application {
    private final Map<String, UserInputHandler> commandHandlers = new HashMap<>();
    private final MenuHandler menuHandler;

    public Application(HeadOfDepartmentHandler headOfDepartmentHandler,
                       ExitCommandHandler exitCommandHandler,
                       LectorsCountCommandHandler lectorsCountCommandHandler,
                       GlobalSearchHandler globalSearchHandler,
                       AverageSalaryHandler averageSalaryHandler,
                       CountByDegreeHandler countByDegreeHandler,
                       MenuHandler menuHandler) {
        this.menuHandler = menuHandler;

        commandHandlers.put("head of department", headOfDepartmentHandler);
        commandHandlers.put("quit", exitCommandHandler);
        commandHandlers.put("count", lectorsCountCommandHandler);
        commandHandlers.put("search", globalSearchHandler);
        commandHandlers.put("salary", averageSalaryHandler);
        commandHandlers.put("count by degree", countByDegreeHandler);
    }

    public void run() {
        menuHandler.menu();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (commandHandlers.get(command) == null) {
                System.out.println("type command from list");
            } else {
                commandHandlers.get(command).command(command);
                menuHandler.menu();
            }
        }
    }
}
