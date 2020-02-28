package com.esrx.services.drugstore.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "DRUGS", schema = "XE")
public class Drug {
	
	@Id
	@Column(name = "Id")
	private Long Id;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "Barcode")
	private Long Barcode;
}
