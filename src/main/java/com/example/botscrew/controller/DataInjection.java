package com.example.botscrew.controller;

import com.example.botscrew.model.Department;
import com.example.botscrew.model.Lector;
import com.example.botscrew.service.DepartmentService;
import com.example.botscrew.service.LectorService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInjection {
    private final DepartmentService departmentService;
    private final LectorService lectorService;

    @PostConstruct
    public void init() {

        Lector lector1 = new Lector();
        lector1.setName("bob");
        lector1.setDegree(Lector.Degree.ASSISTANT);
        lector1.setSalary(300);
        lectorService.add(lector1);

        Lector lector2 = new Lector();
        lector2.setName("sam");
        lector2.setDegree(Lector.Degree.PROFESSOR);
        lector2.setSalary(600);
        lectorService.add(lector2);

        Lector lector3 = new Lector();
        lector3.setName("paul");
        lector3.setDegree(Lector.Degree.PROFESSOR);
        lector3.setSalary(700);
        lectorService.add(lector3);

        List<Lector> mathLectors = new ArrayList<>();
        mathLectors.add(lector1);
        mathLectors.add(lector2);

        List<Lector> physicsLectors = new ArrayList<>();
        physicsLectors.add(lector3);
        physicsLectors.add(lector1);

        Department math = new Department();
        math.setName("math");
        math.setHeadOfDepartment(lector2);
        math.setLectors(mathLectors);
        departmentService.add(math);

        Department physics = new Department();
        physics.setName("physics");
        physics.setHeadOfDepartment(lector3);
        physics.setLectors(physicsLectors);
        departmentService.add(physics);
    }
}
