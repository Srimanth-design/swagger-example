package com.example.swagger.service;

import com.example.swagger.model.Employee;

import java.util.List;

public interface IEmpService {

    public Employee addEmployee(Employee employee);
    public List<Employee> getAll();
}
