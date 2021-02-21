package com.example.springboot.thymeleafDemo.service;

import java.util.List;

import com.example.springboot.thymeleafDemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(Long theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(Long theId);
	
}
