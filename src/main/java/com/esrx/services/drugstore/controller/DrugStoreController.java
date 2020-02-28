package com.esrx.services.drugstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.service.ServiceImpl;

@Controller
@RequestMapping(value = "/drugstore",  produces = "application/json")
public class DrugStoreController {
	
	@Autowired
	ServiceImpl service;
	
	@GetMapping(value = "/drugs",  produces = "application/json")
	public List<GetResponse> getAllDrugs(){
		return service.getAllDrugs();
	
	}
}
