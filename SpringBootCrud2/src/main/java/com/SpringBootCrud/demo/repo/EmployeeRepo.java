package com.SpringBootCrud.demo.repo;

import com.SpringBootCrud.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
