package com.example.botscrew.controller;

import com.example.botscrew.service.DepartmentService;
import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class HeadOfDepartmentHandler implements UserInputHandler {
    private DepartmentService departmentService;
    private ListOfDepartmentsHandler listOfDepartmentsHandler;

    public HeadOfDepartmentHandler(DepartmentService departmentService,
                                   ListOfDepartmentsHandler listOfDepartmentsHandler) {
        this.departmentService = departmentService;
        this.listOfDepartmentsHandler = listOfDepartmentsHandler;
    }

    @Override
    public void command(String command) {
        if (command.equals("head of department")) {
            listOfDepartmentsHandler.command("LIST");
            Scanner scanner = new Scanner(System.in);
            String newCommand = scanner.nextLine();
            System.out.println("======================================================="
                    + "\n"
                    + "RESULT "
                    + departmentService.headOfDepartment(newCommand));
        }
    }
}
