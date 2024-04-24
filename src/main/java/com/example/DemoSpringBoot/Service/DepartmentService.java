package com.example.DemoSpringBoot.Service;

import com.example.DemoSpringBoot.Entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);
    List<Department> getAllDepartments();

    String deleteDepartment(Long id);
}
