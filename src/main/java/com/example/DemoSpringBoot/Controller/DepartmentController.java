package com.example.DemoSpringBoot.Controller;

import com.example.DemoSpringBoot.Entity.Department;
import com.example.DemoSpringBoot.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/")
    public List<Department> getAllDepartment(){
        List<Department> departments = departmentService.getAllDepartments();
        return departments;
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id){
        return departmentService.deleteDepartment(id);
    }
}
