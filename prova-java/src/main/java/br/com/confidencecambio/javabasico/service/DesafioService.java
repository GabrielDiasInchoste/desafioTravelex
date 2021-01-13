package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.dto.NamesResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DesafioService {

	public String calcIMC(ImcDto request) {

		log.info("DesafioService.calcIMC - start - request :{}", request);
		Double calc = request.getPeso() / (request.getAltura() * request.getAltura());
		log.info("DesafioService.calcIMC - end - IMC :{}", calc);
		return new String("Resultado Imc é : ").concat(calc.toString());
	}

	public NamesResponse getNames(String request) {

		log.info("NameService.getNames - start - request :{}", request);
		NamesResponse nameResponse = new NamesResponse();

		nameResponse.setFirstName(getFirstName(request));
		nameResponse.setLastName(getLastName(request));
		nameResponse.setNameAbbreviated(getNameAbbreviated(request));
		nameResponse.setNameUpperCase(request.toUpperCase());

		log.info("NameService.getNames - end - response :{}", nameResponse);
		return nameResponse;
	}

	private String getFirstName(String request) {
		String[] name = request.split(" ", 2);
		return name[0];
	}

	private String getLastName(String request) {
		String[] name = request.split(" ", 2);
		return name[1];
	}

	private String getNameAbbreviated(String request) {
		String response = new String();
		String[] name = request.split(" ");
		name[1] = name[1].substring(0, 1).concat(".");
		for (String string : name) {
			response = response.concat(string).concat(" ");
		}
		return response.substring(0, response.length()-1);
	}
}
