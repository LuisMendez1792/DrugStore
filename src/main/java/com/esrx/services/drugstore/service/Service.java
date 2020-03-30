package com.esrx.services.drugstore.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.model.Drug;

@Component
public interface Service {
	Drug createDrug(CreateRequest request);
	List<Drug> getDrugs(String name, String codebar);
	void deleteDrug(String id);
	Drug updateDrug(UpdateRequest request, String id);
}
