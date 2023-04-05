package com.gl.com.gl.employeemanagementsystem.service;

import java.util.List;

import com.gl.employeemanagementsystem.entity.Employee;

public interface EmployeeService {
	List<Employee>getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeId(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);

}
