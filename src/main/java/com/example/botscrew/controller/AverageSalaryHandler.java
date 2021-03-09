package com.example.botscrew.controller;

import com.example.botscrew.model.Lector;
import com.example.botscrew.service.DepartmentService;
import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class AverageSalaryHandler implements UserInputHandler {
    private DepartmentService departmentService;
    private ListOfDepartmentsHandler listOfDepartmentsHandler;

    public AverageSalaryHandler(DepartmentService departmentService,
                                ListOfDepartmentsHandler listOfDepartmentsHandler) {
        this.departmentService = departmentService;
        this.listOfDepartmentsHandler = listOfDepartmentsHandler;
    }

    @Override
    public void command(String command) {
        if (command.equals("salary")) {
            listOfDepartmentsHandler.command("LIST");
            Scanner scanner = new Scanner(System.in);
            String department = scanner.nextLine();
            int salary = departmentService.getByName(department).getLectors().stream()
                    .mapToInt(Lector::getSalary).sum();
            int size = departmentService.getCountOfLectors(department);
            System.out.println("======================================================="
                    + "\n"
                    + "RESULT " + salary / size);
        }
    }
}
