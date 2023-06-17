package com.codemash.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
	
	@JsonProperty
	private long id;
	
	@JsonProperty
	@NotEmpty
	@Size(min=3,max=10, message = "Employee name length should be between3 to 10")
	private String name;
	
	@JsonProperty
	@NotEmpty
	@Size(min=3,max=10, message = "Employee city name length should be between3 to 10")
	private String city;
	

}
