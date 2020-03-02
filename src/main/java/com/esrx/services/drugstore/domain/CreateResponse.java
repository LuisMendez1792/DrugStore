package com.esrx.services.drugstore.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreateResponse {

		private Long Id;

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}
}
