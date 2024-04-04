package com.nagarro.training.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.training.model.Employee;

@Component
public class Database {

	private List<Employee> employeesList;

	Database() {
		employeesList = new ArrayList<>();
	}

	public List<Employee> getEmployeesList() {
		return employeesList;
	}

	public void saveEmployees(Employee employee) {
		employeesList.add(employee);
	}

}
