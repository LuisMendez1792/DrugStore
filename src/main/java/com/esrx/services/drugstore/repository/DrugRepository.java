package com.esrx.services.drugstore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esrx.services.drugstore.model.Drug;

@Repository
public interface DrugRepository extends CrudRepository<Drug, Long> {
	public Optional<Drug> findById(Long Id);
	public List<Drug> findAll();
	public Drug save(Drug postdrug);
	public void deleteById(Long Id);
	
}
