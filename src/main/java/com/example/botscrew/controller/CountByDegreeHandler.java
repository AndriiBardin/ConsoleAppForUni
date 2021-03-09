package com.example.botscrew.controller;

import com.example.botscrew.model.Lector;
import com.example.botscrew.service.DepartmentService;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class CountByDegreeHandler implements UserInputHandler {
    private DepartmentService departmentService;
    private ListOfDepartmentsHandler listOfDepartmentsHandler;

    public CountByDegreeHandler(DepartmentService departmentService,
                                ListOfDepartmentsHandler listOfDepartmentsHandler) {
        this.departmentService = departmentService;
        this.listOfDepartmentsHandler = listOfDepartmentsHandler;
    }

    @Override
    public void command(String command) {
        if (command.equals("count by degree")) {
            listOfDepartmentsHandler.command("LIST");
            Scanner scanner = new Scanner(System.in);
            String department = scanner.nextLine();
            departmentService.getByName(department).getLectors().stream()
                    .collect(Collectors.groupingBy(Lector::getDegree,Collectors.counting()))
                    .entrySet().stream()
                    .forEach(entry ->
                            System.out.println("================================================"
                                    + "======="
                                    + "\n"
                                    + "RESULT "
                                    + "Degree:" + entry.getKey().name()
                                    + ":" + entry.getValue()));

        }
    }
}
