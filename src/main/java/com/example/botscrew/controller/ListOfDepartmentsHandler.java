package com.example.botscrew.controller;

import com.example.botscrew.model.Department;
import com.example.botscrew.service.DepartmentService;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ListOfDepartmentsHandler implements UserInputHandler {
    private DepartmentService departmentService;

    public ListOfDepartmentsHandler(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void command(String command) {
        if (command.equals("LIST")) {
            List<Department> all = departmentService.getAll();
            System.out.println("=======================================================");
            System.out.println("LIST OF DEPARTMENTS");
            all.stream().forEach(department -> System.out.println(department.getName()));
            System.out.println("=======================================================");
            System.out.println("TYPE NAME OF DEPARTMENT");
        }
    }
}
