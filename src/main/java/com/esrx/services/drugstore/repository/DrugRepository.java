package com.esrx.services.drugstore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.esrx.services.drugstore.model.Drug;

@Repository
public interface DrugRepository extends MongoRepository<Drug, String> {
	List<Drug> findByName(String name);
	Optional<Drug> findByCodebar(String codebar);
}
