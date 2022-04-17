package com.example.swagger.service;

import com.example.swagger.model.Employee;
import com.example.swagger.repository.IEmployeeRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService{

    private IEmployeeRepo employeeRepo;

    @Autowired
    public void setEmployeeRepo(IEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }
}
