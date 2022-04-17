package com.example.swagger.controllers;


import com.example.swagger.model.Employee;
import com.example.swagger.service.IEmpService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private IEmpService empService;

    @Autowired
    public void setEmpService(IEmpService empService) {
        this.empService = empService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody  Employee employee){
        return empService.addEmployee(employee);
    }

    @GetMapping("/emps")
    public List<Employee> getAll(){
        return empService.getAll();
    }
}
