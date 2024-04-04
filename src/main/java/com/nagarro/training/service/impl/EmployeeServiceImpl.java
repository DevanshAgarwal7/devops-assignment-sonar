package com.nagarro.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.training.model.Employee;
import com.nagarro.training.repository.EmployeeRespository;
import com.nagarro.training.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRespository employeeRepository;

	@Override
	public List<Employee> getAll() {
		return this.employeeRepository.findAllEmployees();
	}

	@Override
	public Employee save(Employee employee) {
		return this.employeeRepository.save(employee);
	}

}
