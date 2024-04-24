package com.example.DemoSpringBoot.Repository;

import com.example.DemoSpringBoot.Entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {

}
