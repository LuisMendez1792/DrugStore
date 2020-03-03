package com.esrx.services.drugstore.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Table(name = "DRUGS", schema = "SYSTEM")
public class Drug {

	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SYSTEM.MY_SEQ")
	@SequenceGenerator(name = "SYSTEM.MY_SEQ", allocationSize = 1)
	@Column(name = "Id")
	@Id private Long Id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Description")
	private String Description;

	@Column(name = "Codebar")
	private Long Codebar;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Long getCodebar() {
		return Codebar;
	}

	public void setCodebar(Long codebar) {
		Codebar = codebar;
	}

}
