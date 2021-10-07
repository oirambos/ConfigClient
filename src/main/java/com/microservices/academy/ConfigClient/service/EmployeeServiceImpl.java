package com.microservices.academy.ConfigClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.microservices.academy.ConfigClient.client.AccountsClient;
import com.microservices.academy.ConfigClient.model.AccountsRequest;
import com.microservices.academy.ConfigClient.model.AccountsResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	AccountsClient feignClient;
	@Value("${employee.department}")
	private String department;
	@Override
	public int getNumberOfAccounts() {
		log.info("Requesting for department: {}",department);
		AccountsRequest request = new AccountsRequest(department);
		AccountsResponse accounts = feignClient.retrieveAccountsCatalog(request);
		Gson g = new Gson();
		log.info("Getting response: {}",g.toJson(accounts));
		return accounts.accounts.size();
	}
	

}
