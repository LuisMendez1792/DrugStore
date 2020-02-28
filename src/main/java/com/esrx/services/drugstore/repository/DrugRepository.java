package com.esrx.services.drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esrx.services.drugstore.model.Drug;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Long> {
	public List<Drug> findAll();
}
