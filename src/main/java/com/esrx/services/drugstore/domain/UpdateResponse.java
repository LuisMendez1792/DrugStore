package com.esrx.services.drugstore.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class UpdateResponse {
	private Long Id;
	private String name;
	private String description;
	private Long codebar;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCodebar() {
		return codebar;
	}
	public void setCodebar(Long codebar) {
		this.codebar = codebar;
	}
}
