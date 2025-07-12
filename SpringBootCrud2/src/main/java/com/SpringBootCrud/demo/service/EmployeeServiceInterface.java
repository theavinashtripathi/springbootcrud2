package com.SpringBootCrud.demo.service;

import com.SpringBootCrud.demo.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

   public Employee getEmployeeByID(Long eid);

    public void deleteEmployeeByID(Long empid);

}
