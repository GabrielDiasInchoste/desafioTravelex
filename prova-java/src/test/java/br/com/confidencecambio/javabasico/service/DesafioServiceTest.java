package br.com.confidencecambio.javabasico.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.confidencecambio.javabasico.dto.Cliente;
import br.com.confidencecambio.javabasico.dto.Gerente;
import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.dto.NamesResponse;
import br.com.confidencecambio.javabasico.dto.Robo;

@SpringBootTest
public class DesafioServiceTest {

	@Autowired
    private DesafioService desafioService;

    @Test
    public void calcImcSucessTest(){
        String response = desafioService.calcIMC(new ImcDto(60.50D,1.70D));
        assertEquals("Resultado Imc é : 20.934256055363324",response);
    }
	
    @Test
    public void clienteGetNamesSucessTest(){
    	Cliente cliente = new Cliente("João Soares Silva");
        NamesResponse clienteResponse = desafioService.getNames(cliente.getName());
        assertEquals(getNameResponseAssert(),clienteResponse);
    }
    
    @Test
    public void gerenteGetNamesSucessTest(){
    	Gerente gerente = new Gerente("João Soares Silva");
        NamesResponse gerenteResponse = desafioService.getNames(gerente.getName());
        assertEquals(getNameResponseAssert(),gerenteResponse);
    }  
    
    @Test
    public void roboFetNamesSucessTest(){
    	Robo robo = new Robo("João Soares Silva");
        NamesResponse roboResponse = desafioService.getNames(robo.getName());
        assertEquals(getNameResponseAssert(),roboResponse);
    }

    private NamesResponse getNameResponseAssert() {
    	
    	NamesResponse response = new NamesResponse();
    	response.setFirstName("João");
    	response.setLastName("Soares Silva");
    	response.setNameAbbreviated("João S. Silva");
    	response.setNameUpperCase("JOÃO SOARES SILVA");
    	
    	return response;
    }
    
}
