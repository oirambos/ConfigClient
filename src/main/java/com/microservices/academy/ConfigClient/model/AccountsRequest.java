package com.microservices.academy.ConfigClient.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class AccountsRequest {

	private String department;

//	public void setDepartment(String department) {
//		this.department = department;
//	}

//	public String getDepartment() {
//		return this.department;
//	}
}
