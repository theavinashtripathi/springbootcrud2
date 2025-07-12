package com.SpringBootCrud.demo.Controller;


import com.SpringBootCrud.demo.entity.Employee;
import com.SpringBootCrud.demo.service.EmployeeServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/details")
public class EmployeeController {

    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;


    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee saveEmployee= employeeServiceInterface.addEmployee(employee);
        return new ResponseEntity<Employee>(saveEmployee,HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> allEmployee = employeeServiceInterface.getAllEmployees();
        return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);
    }

    @GetMapping("/emp/{empid}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable("empid") Long empid){
        Employee aEmployee = employeeServiceInterface.getEmployeeByID(empid);
        return new ResponseEntity<Employee>(aEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empid}")
    public ResponseEntity<Void> deleteEmployeeByID(@PathVariable("empid") Long empid){
        employeeServiceInterface.deleteEmployeeByID(empid);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee upadtedEmployee = employeeServiceInterface.addEmployee(employee);
        return new ResponseEntity<Employee>(upadtedEmployee, HttpStatus.ACCEPTED);
    }


}
