package com.example.botscrew.service;

import com.example.botscrew.model.Department;
import com.example.botscrew.repository.DepartmentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department add(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public String headOfDepartment(String departmentName) {
        return departmentRepository.findByName(departmentName).getHeadOfDepartment().getName();
    }

    @Override
    public int getCountOfLectors(String departmentName) {
        return departmentRepository.findByName(departmentName).getLectors().size();
    }

    @Override
    public Department getByName(String departmentName) {
        return departmentRepository.findByName(departmentName);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}
