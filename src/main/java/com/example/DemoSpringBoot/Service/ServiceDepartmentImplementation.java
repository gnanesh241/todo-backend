package com.example.DemoSpringBoot.Service;

import com.example.DemoSpringBoot.Entity.Department;
import com.example.DemoSpringBoot.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDepartmentImplementation implements DepartmentService
{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return (List<Department>) departmentRepository.findAll();

    }

    @Override
    public String deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
        return "";
    }
}
