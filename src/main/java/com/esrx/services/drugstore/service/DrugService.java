package com.esrx.services.drugstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.model.Drug;

@Service
public interface DrugService {
	List<GetResponse> getAllDrugs();
}
