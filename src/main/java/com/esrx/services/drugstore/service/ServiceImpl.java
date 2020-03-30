package com.esrx.services.drugstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.HttpClientErrorException;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.model.Drug;
import com.esrx.services.drugstore.repository.DrugRepository;

import io.micrometer.core.instrument.util.StringUtils;
import ma.glasnost.orika.MapperFacade;

@Component
public class ServiceImpl implements Service {

	private static final Logger log = LoggerFactory.getLogger(DrugRepository.class);

	@Autowired
	DrugRepository repo;

	@Autowired
	private MapperFacade orikaMapperFacade;

	public List<Drug> getDrugs(String name, String codebar) {
		List<Drug> drugList = new ArrayList<>();
		Optional<Drug> drug = null;
		log.info("Searching the Drug");
		if (StringUtils.isNotBlank(codebar)) {
			drug = repo.findByCodebar(codebar);
			if (drug != null && drug.isPresent()) {
				drugList.add(drug.get());
				return drugList;
			}
		}
		if (StringUtils.isNotBlank(name)) {
			drugList = repo.findByName(name);
			if (!CollectionUtils.isEmpty(drugList)) {
				return drugList;
			}
		}

		log.warn("No user was found for given Codebar & Name combination. ");

		drugList = repo.findAll();

		log.debug("Records was found on DB - " + drugList.toString());

		return drugList;
	}

	public Drug createDrug(CreateRequest request) {
		Drug drug = new Drug();
		drug = orikaMapperFacade.map(request, Drug.class);
		log.info("Entity pre-saving - " + drug);
		repo.save(drug);
		log.info("Entity post-saving - " + drug);
		return drug;
	}

	public void deleteDrug(String id) {
		if (repo.existsById(id)) {
			log.debug("Deleting user with id: " + id);
			repo.deleteById(id);
		}

	}

	public Drug updateDrug(UpdateRequest request, String id) {
		if (!repo.existsById(id))
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "NO USERS FOUND WITH THE GIVEN ID ");
		Drug drug = new Drug();
		drug = orikaMapperFacade.map(request, Drug.class);
		drug.setId(id);
		return repo.save(drug);

	}

}
