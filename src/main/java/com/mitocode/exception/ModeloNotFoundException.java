package com.mitocode.exception;



//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3560838655515585192L;

	public ModeloNotFoundException(String mensaje) {
		super(mensaje);
	}
}
