package com.esrx.services.drugstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.domain.UpdateResponse;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.repository.DrugRepository;
import com.esrx.services.drugstore.service.ServiceImpl;

@RestController
@RequestMapping(value = "/",  produces = "application/json")
public class DrugStoreController {
	
	@Autowired
	ServiceImpl service;
	
	private static final Logger log = LoggerFactory.getLogger(DrugRepository.class);
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping(value = "/drugs",  produces = "application/json")
	public List<GetResponse> getDrugs(){
		return service.getDrugs();
	
	}
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping(value = "/drugs/{Id}",  produces = "application/json")
	public GetResponse getDrug(@PathVariable Long Id){
		return service.getDrugById(Id);
	
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/drugs", consumes = "application/json", produces = "application/json")
	public CreateResponse postDrug(@RequestBody CreateRequest request) {
		return service.postDrug(request);
	}
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping(value = "/drugs/{Id}", consumes = "application/json", produces = "application/json")
	public UpdateResponse putDrug(@RequestBody UpdateRequest request, @PathVariable Long Id) {
		
		return service.putDrug(request, Id);
	}
	
	@ResponseStatus(HttpStatus.GONE)
	@DeleteMapping(value = "drugs/{Id}")
	public void deleteDrugByid(@PathVariable Long Id) {
		log.info("Deleting the Drug with Id: " + Id);
		service.deleteDrugById(Id);
	}
}
