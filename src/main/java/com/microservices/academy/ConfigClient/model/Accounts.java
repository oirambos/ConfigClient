package com.microservices.academy.ConfigClient.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Accounts {

	public String employeeName; 
	public String accountNumber;
	public String issuingBank;
}
