package br.com.claro.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.claro.model.InfoError;
import br.com.claro.service.exceptions.MobileNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(MobileNotFoundException.class)
	public ResponseEntity<InfoError> handlerMobileNotFoundException( MobileNotFoundException e, HttpServletRequest req ){
		InfoError error = new InfoError("Mobile Not Found", 404L, System.currentTimeMillis(), "This mobile was not found on the data base");
		return ResponseEntity.status( HttpStatus.NOT_FOUND).body(error);
	}
}