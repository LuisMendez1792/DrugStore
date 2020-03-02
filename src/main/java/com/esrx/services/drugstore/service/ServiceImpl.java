package com.esrx.services.drugstore.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.repository.DrugRepository;

import ma.glasnost.orika.MapperFacade;

@Repository
public class ServiceImpl implements DrugService{
	
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
		else
			return orikaMapperFacade.mapAsList(drugList, GetResponse.class);
	}
	
	@Override
	public CreateResponse postDrug(CreateRequest request) {
		CreateResponse response = new CreateResponse();
		Drug drugEntity = new Drug();
		drugEntity = orikaMapperFacade.map(request, Drug.class);
		Drug saveDrug = repo.save(drugEntity);
		response = orikaMapperFacade.map(saveDrug,  CreateResponse.class);
		return response;
	}

}
