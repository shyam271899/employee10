package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.repository.employeeRepository;
import com.example.employee.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class employeeController {


   // @Autowired
   // employeeService employeeservice;

    @Autowired
    private employeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }
}
