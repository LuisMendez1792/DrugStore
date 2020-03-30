package com.esrx.services.drugstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.repository.DrugRepository;
import com.esrx.services.drugstore.service.Service;

@RestController
@RequestMapping(value = "/Store", produces = "application/json")
public class DrugStoreController {

	@Autowired
	Service service;

	private static final Logger log = LoggerFactory.getLogger(DrugRepository.class);
	

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/drugs/")
	public List<Drug> getDrugs(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "codebar", required = false) String codebar) {
		log.debug("Get users parameters - Name= " + name + ", Codebar= " + codebar);
		return service.getDrugs(name, codebar);

	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/drugs/")
	public String postDrug(@RequestBody CreateRequest request) {
		log.debug("Create user request - " + request.toString());
		return service.createDrug(request).getId();
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping(value = "/drugs/{id}", consumes = "application/json", produces = "application/json")
	public Drug updateDrug(@RequestBody UpdateRequest request, @PathVariable String id) {
		log.debug("Update Drug request - id= " + id + " " + request.toString());
		return service.updateDrug(request, id);
	}

	@ResponseStatus(HttpStatus.GONE)
	@DeleteMapping(value = "/drugs/{id}")
	public void deleteDrug(@PathVariable String id) {
		log.info("Deleting the Drug with Id: " + id);
		service.deleteDrug(id);
	}
}
