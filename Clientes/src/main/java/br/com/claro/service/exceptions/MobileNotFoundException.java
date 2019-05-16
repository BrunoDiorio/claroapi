package br.com.claro.service.exceptions;

public class MobileNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 3888138877817919221L;

	public MobileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MobileNotFoundException(String message) {
		super(message);
	}

}
