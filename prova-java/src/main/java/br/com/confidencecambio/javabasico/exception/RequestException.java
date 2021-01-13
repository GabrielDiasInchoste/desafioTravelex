package br.com.confidencecambio.javabasico.exception;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestException implements Serializable {

	private static final long serialVersionUID = 1L;

	private HttpStatus status;
	private List<String> message;
}
