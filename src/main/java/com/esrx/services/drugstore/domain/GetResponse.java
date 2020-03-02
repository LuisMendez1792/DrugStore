package com.esrx.services.drugstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class GetResponse {
	
//	private Long Id;
	private String Name;
	private String Description;
	private Long Codebar;
	
//	public Long getId() {
//		return Id;
//	}
//	public void setId(Long id) {
//		Id = id;
//	}
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
