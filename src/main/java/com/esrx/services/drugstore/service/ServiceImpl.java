package com.esrx.services.drugstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.repository.DrugRepository;

import ma.glasnost.orika.MapperFacade;
public class ServiceImpl implements DrugService{
	
	@Autowired
	DrugRepository repo;
	
	@Autowired
	private MapperFacade orikaMapperFacade;
	
	public List<GetResponse> getAllDrugs(){
		List<Drug> drugList = repo.findAll();
		return orikaMapperFacade.mapAsList(drugList, GetResponse.class);
	}

}
