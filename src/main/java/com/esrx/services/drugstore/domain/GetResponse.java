package com.esrx.services.drugstore.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Data
public class GetResponse {

	private String id;
	private String name;
	private String description;
	private String codebar;

}
