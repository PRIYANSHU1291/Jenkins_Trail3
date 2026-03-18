package com.springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot2.model.Employee;
import com.springboot2.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired 
	private EmployeeService employeeService;
	
	
	
	@PostMapping("/add")
	public Employee save(@RequestBody Employee emp) {
		
		return employeeService.save(emp);
	}
	
	@GetMapping("/get")
	public List<Employee> getAllEmployee(){
		return employeeService.getAll();
	}
	
	@GetMapping("/display/{id}")
	public Employee getEmployeeById(@PathVariable int d) {
		return employeeService.getEmployeeById(d);
	}
	
	
	
	
	
	
	
	
}
