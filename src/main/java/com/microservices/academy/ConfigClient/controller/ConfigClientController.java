package com.microservices.academy.ConfigClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.academy.ConfigClient.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ConfigClientController {

	@Autowired
	private EmployeeService employeeService;
	
	@Value("${employee.salary}")
	private String salary;
	@Value("${database.env}")
	private String dbenvironment;
		
	@RequestMapping("/employee/accounts")
	public String home() {
		log.info("Resource: /employee/accounts");
		int accountsNumber = employeeService.getNumberOfAccounts();
	    return "The number of accounts for this department is: "+ accountsNumber;
	}
}
