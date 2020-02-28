package com.esrx.services.drugstore.service;

import java.util.List;

import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.model.Drug;


public interface DrugService {
	List<GetResponse> getAllDrugs();
}
