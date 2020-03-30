package com.esrx.services.drugstore.domain;

import lombok.Data;

@Data
public class UpdateResponse {
	private String id;
	private String name;
	private String description;
	private String codebar;
}
