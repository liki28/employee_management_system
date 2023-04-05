package com.gl.employeemanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.com.gl.employeemanagementsystem.service.EmployeeService;
import com.gl.employeemanagementsystem.entity.Employee;
import com.gl.employeemanagementsystem.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeId(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

	
	

}
