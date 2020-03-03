package com.esrx.services.drugstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.domain.UpdateResponse;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.repository.DrugRepository;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;

@Slf4j
@Service
public class ServiceImpl implements DrugService{
	
	private static final Logger log = LoggerFactory.getLogger(DrugRepository.class);
	
	@Autowired
	DrugRepository repo;
	
	@Autowired
	private MapperFacade orikaMapperFacade;
	
	@Override
	public List<GetResponse> getDrugs(){
		List<Drug> drugList = new ArrayList<>();
		drugList = repo.findAll();
		
		if(CollectionUtils.isEmpty(drugList))
			throw new EntityNotFoundException("Drugs was not found");
		else {
			log.info("The drugs was founded");
			return orikaMapperFacade.mapAsList(drugList, GetResponse.class);
		}
	}
	
	@Override
	public GetResponse getDrugById(Long Id) {
		Optional<Drug> drug = repo.findById(Id);
		if(drug.isPresent()) {
			GetResponse drugfound = new GetResponse();
			drugfound = orikaMapperFacade.map(drug.get(), GetResponse.class);
			log.info("Drug founded " + drug);
			return drugfound;
		}
		else {
			log.info("Dug was not found");
			throw new EntityNotFoundException("Drug was not found");
		}
	}
	
	@Override
	public CreateResponse postDrug(CreateRequest request) {
		CreateResponse response = new CreateResponse();
		Drug drugEntity = new Drug();
		drugEntity = orikaMapperFacade.map(request, Drug.class);
		log.info("Creating Drug");
		Drug saveDrug = repo.save(drugEntity);
		log.info("Drug was created");
		response = orikaMapperFacade.map(saveDrug,  CreateResponse.class);
		return response;
	}
	
	@Override 
	public UpdateResponse putDrug(UpdateRequest request, Long Id) {
		UpdateResponse response = new UpdateResponse();
		GetResponse getDrug = getDrugById(Id);
		orikaMapperFacade.map(request,  getDrug);
		Drug drugEntity = orikaMapperFacade.map(getDrug, Drug.class);
		log.info("Mapped foun drug to new entity: " + drugEntity );
		Drug savedEntity = repo.save(drugEntity);
		log.info("The drug was updated" + savedEntity);
		response = orikaMapperFacade.map(savedEntity, UpdateResponse.class);
		return response;
		
	}
	
	@Override
	public void deleteDrugById(Long Id) {
		if(!repo.existsById(Id)) {
			throw new EntityNotFoundException("The drug wit the id " + Id + " was not found");
		}else {
			repo.deleteById(Id);
			log.info("The drug with the Id: " + Id + " was deleted!!");
		}
		
	}

}
