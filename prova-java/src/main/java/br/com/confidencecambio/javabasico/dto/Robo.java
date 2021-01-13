package br.com.confidencecambio.javabasico.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Robo {
	
	@NotBlank(message = "Nome nao pode estar em branco ou ser nulo")
	private String name;
	
}
