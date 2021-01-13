package br.com.confidencecambio.javabasico.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImcDto {

	@NotNull(message ="Peso nao pode ser null ou vazio")
	private Double peso;
	
	@NotNull(message ="Altura nao pode ser null ou vazio")
	private Double altura;
	
}
