package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class employeeService
{

    @Autowired
    employeeRepository employeerepository;

    public List<Employee> getEmployeeDetails()
    {
     return employeerepository.findAll();
    }


}
