package com.example.botscrew.service;

import com.example.botscrew.model.Department;
import java.util.List;

public interface DepartmentService {
    Department add(Department department);

    String headOfDepartment(String departmentName);

    int getCountOfLectors(String departmentName);

    Department getByName(String departmentName);

    List<Department> getAll();
}
