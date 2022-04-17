package com.example.swagger;

import com.example.swagger.model.Employee;
import com.example.swagger.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Swagger3DemoApplication implements CommandLineRunner {


	private IEmpService empService;

	@Autowired
	public void setEmpService(IEmpService empService) {

		this.empService = empService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Swagger3DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setEmpName("Srimanth");
		employee.setGender("Male");
		employee.setAge("23");
		//empService.addEmployee(employee);
	}
}
