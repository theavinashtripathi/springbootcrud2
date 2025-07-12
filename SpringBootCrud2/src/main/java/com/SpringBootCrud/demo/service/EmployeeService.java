package com.SpringBootCrud.demo.service;


import com.SpringBootCrud.demo.entity.Employee;
import com.SpringBootCrud.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepo crudRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        return crudRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return crudRepo.findAll();
    }



    @Override
    public Employee getEmployeeByID(Long eid) {
        return crudRepo.findById(eid).get();
    }

    @Override
    public void deleteEmployeeByID(Long empid) {
         crudRepo.deleteById(empid);
    }


}
