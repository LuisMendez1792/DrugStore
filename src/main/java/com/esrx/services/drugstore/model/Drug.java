package com.esrx.services.drugstore.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity

@AllArgsConstructor
@Table(name = "DRUGS" , schema = "SYSTEM")
public class Drug {
	
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

	@Id
//	@Column(name = "Id")
	private Long Id;
	
	//@Column(name = "Name")
	private String Name;
	
	//@Column(name = "Description")
	private String Description;
	
	//@Column(name = "Codebar")
	private Long Codebar;
}
