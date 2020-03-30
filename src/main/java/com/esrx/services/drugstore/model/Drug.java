package com.esrx.services.drugstore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Drugs")
public class Drug {
	@Id
	private String id;

	private String name;

	private String description;
 
	private String codebar;

}
