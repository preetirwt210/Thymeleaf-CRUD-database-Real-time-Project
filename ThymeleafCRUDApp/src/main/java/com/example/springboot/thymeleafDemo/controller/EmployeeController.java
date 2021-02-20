package com.example.springboot.thymeleafDemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.thymeleafDemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		Employee emp1=new Employee(1,"Preeti", "Rawat", "preetirawat711@gmail.com");
		Employee emp2=new Employee(2,"Happy", "Rawat", "happyrawat56@gmail.com");
		Employee emp3=new Employee(3,"Priya", "Rawat", "priyarawat23@gmail.com");
		
		theEmployees=new ArrayList<>();
		
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
		
	}
	
	@GetMapping("/list")
	public String listEmployee(Model theModel) {
		
		theModel.addAttribute("employees", theEmployees);
		return "list-employees";
	}
}
