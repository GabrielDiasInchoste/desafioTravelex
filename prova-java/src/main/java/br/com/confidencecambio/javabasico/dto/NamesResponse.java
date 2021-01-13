package br.com.confidencecambio.javabasico.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NamesResponse {

	private String firstName;

	private String lastName;
	
	private String nameUpperCase;
	
	private String nameAbbreviated;
	
}
