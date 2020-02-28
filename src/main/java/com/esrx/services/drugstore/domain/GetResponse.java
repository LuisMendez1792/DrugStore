package com.esrx.services.drugstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class GetResponse {
	private Long Id;
	private String Name;
	private String Description;
	private Long Barcode;
}
