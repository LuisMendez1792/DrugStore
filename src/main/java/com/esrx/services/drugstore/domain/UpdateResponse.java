package com.esrx.services.drugstore.domain;

import lombok.Data;

@Data
public class UpdateResponse {
	private Long Id;
	private String name;
	private String description;
	private Long codebar;
}
