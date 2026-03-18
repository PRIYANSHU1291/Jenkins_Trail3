package com.springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.model.Employee;
import com.springboot2.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee emp) {
		
		return employeeRepo.save(emp);
	}
	public List<Employee> getAll() {
		return  employeeRepo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	
	
	
	
}
