package br.com.confidencecambio.javabasico.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private HttpStatus status;
	private String message;
}
