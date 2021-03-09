package com.example.botscrew.repository;

import com.example.botscrew.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("select d from departments d where d.name = ?1")
    Department findByName(String departmentName);
}
