package com.example.springboot.thymeleafDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.thymeleafDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
