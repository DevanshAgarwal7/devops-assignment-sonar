package com.nagarro.training.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.training.database.Database;
import com.nagarro.training.model.Employee;
import com.nagarro.training.repository.EmployeeRespository;

@Component
public class EmployeeRepositoryImpl implements EmployeeRespository {
	
	@Autowired
	private Database database;

	@Override
	public List<Employee> findAllEmployees() {
		System.out.println("Employees Fetched Successfully.");
		return this.database.getEmployeesList();
	}

	@Override
	public Employee save(Employee employee) {
		System.out.println("Employee Saved Successfully.");
		this.database.saveEmployees(employee);
		return employee;
	}
	

}
