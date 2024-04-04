package com.nagarro.training.repository;

import java.util.List;

import com.nagarro.training.model.Employee;

public interface EmployeeRespository {

	List<Employee> findAllEmployees();

	Employee save(Employee employee);

}
