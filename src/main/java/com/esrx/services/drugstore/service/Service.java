package com.esrx.services.drugstore.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.domain.UpdateResponse;

@Component
public interface Service {
	public GetResponse getDrugById(Long Id);

	public List<GetResponse> getDrugs();

	public CreateResponse postDrug(CreateRequest request);

	public UpdateResponse putDrug(UpdateRequest request, Long Id);

	public void deleteDrugById(Long Id);

}
