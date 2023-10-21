package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDTO {

    public Long id;
    public String name;

   // public List<Employee> employees = new ArrayList<>();

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public List<Employee> getEmployees() {
//        return employees;
//    }
}
