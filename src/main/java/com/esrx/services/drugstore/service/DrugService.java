package com.esrx.services.drugstore.service;

import java.util.List;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.domain.UpdateResponse;

public interface DrugService {
	GetResponse getDrugById(Long Id);
	List<GetResponse> getDrugs();
	CreateResponse postDrug(CreateRequest request);
	UpdateResponse putDrug(UpdateRequest request, Long Id);
	void deleteDrugById(Long Id);
	
}
