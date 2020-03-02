package com.esrx.services.drugstore.domain;

import org.codehaus.commons.nullanalysis.NotNull;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class CreateRequest {
	
	@NotNull
	private String Name;
	@NotNull
	private String Description;
	@NotNull
	private Long Codebar;
	
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
