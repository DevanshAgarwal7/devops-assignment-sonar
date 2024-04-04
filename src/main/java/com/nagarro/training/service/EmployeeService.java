package com.nagarro.training.service;

import java.util.List;

import com.nagarro.training.model.Employee;

public interface EmployeeService {

	List<Employee> getAll();

	Employee save(Employee employee);

}
