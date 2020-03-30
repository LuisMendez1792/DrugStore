package com.esrx.services.drugstore.domain;

import org.codehaus.commons.nullanalysis.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class CreateRequest {
	
	@NotNull
	private String name;
	@NotNull
	private String description;
	@NotNull
	private String codebar;	
}
