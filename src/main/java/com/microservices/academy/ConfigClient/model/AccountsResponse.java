package com.microservices.academy.ConfigClient.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsResponse {

	public List<Accounts>  accounts;
	
}
