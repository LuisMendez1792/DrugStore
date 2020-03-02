package com.esrx.services.drugstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;


import com.esrx.services.drugstore.service.ServiceImpl;

@RestController
@RequestMapping(value = "/",  produces = "application/json")
public class DrugStoreController {
	
	@Autowired
	ServiceImpl service;
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping(value = "/drugs",  produces = "application/json")
	public List<GetResponse> getDrugs(){
		return service.getDrugs();
	
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/drugs", consumes = "application/json", produces = "application/json")
	public CreateResponse postdrug(@RequestBody CreateRequest request) {
		return service.postDrug(request);
	}
}
