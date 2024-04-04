package com.nagarro.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.model.Employee;
import com.nagarro.training.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get")
	public String TestApi() {
		return "Hello this is Springboot API";
	}
	
	@GetMapping(value = "/get/employee")
	public List<Employee> getAllEmployees(){
		return this.employeeService.getAll();
	}
	
	@PostMapping(value = "/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return this.employeeService.save(employee);
	}
}
