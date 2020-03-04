package com.esrx.services.drugstore.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Data
public class GetResponse {

	private Long Id;
	private String Name;
	private String Description;
	private Long Codebar;

}
