package com.esrx.services.drugstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
@Table(name = "DRUGS", schema = "SYSTEM")
public class Drug {

	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SYSTEM.MY_SEQ")
	@SequenceGenerator(name = "SYSTEM.MY_SEQ", allocationSize = 1)
	@Column(name = "Id")
	@Id private Long Id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Description")
	private String Description;

	@Column(name = "Codebar")
	private Long Codebar;

}
