package com.microservices.academy.ConfigClient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.academy.ConfigClient.model.AccountsRequest;
import com.microservices.academy.ConfigClient.model.AccountsResponse;

@FeignClient(name="${feignclient.accounts.name}")
//The following line indicates how to implement a feign call using the resource url
//@FeignClient(name="${feignclient.accounts.name}", url="${ACCOUNT-CATALOG.ribbon.listOfServers}")
public interface AccountsClient {

	@PostMapping("${feignclient.accounts.uri}")
	AccountsResponse retrieveAccountsCatalog(@RequestBody AccountsRequest request);
}
