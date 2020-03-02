package com.esrx.services.drugstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.service.ServiceImpl;

@RestController
@RequestMapping(value = "/",  produces = "application/json")
public class DrugStoreController {
	
	@Autowired
	ServiceImpl service;
	
	@GetMapping(value = "/drugs",  produces = "application/json")
	public List<GetResponse> getDrugs(){
		return service.getDrugs();
	
	}
}
