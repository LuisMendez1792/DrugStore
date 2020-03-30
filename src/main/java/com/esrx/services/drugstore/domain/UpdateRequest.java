package com.esrx.services.drugstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class UpdateRequest {

	private String name;
	private String description;
	private String codebar;
}

