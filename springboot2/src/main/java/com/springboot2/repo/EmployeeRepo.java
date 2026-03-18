package com.springboot2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot2.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	

}
