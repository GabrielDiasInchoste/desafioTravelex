package br.com.confidencecambio.javabasico.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.dto.Cliente;
import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.dto.NamesResponse;
import br.com.confidencecambio.javabasico.service.DesafioService;

@RestController
public class DesafioController {

	@Autowired
    private DesafioService desafioService;
	

    @PostMapping(value = "/imc")
    public ResponseEntity<String> calcImc(@Valid @RequestBody ImcDto request) {
        return new ResponseEntity<>(desafioService.calcIMC(request), HttpStatus.OK);
    }
	
    @PostMapping(value = "/name")
    public ResponseEntity<NamesResponse> olaMundo(@Valid @RequestBody Cliente request) {
        return new ResponseEntity<>(desafioService.getNames(request.getName()), HttpStatus.OK);
    }
    
}
