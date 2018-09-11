package com.br.e.commerce.gateway.http.exception;

public class CustomerNotFoundException extends RuntimeException {

  public CustomerNotFoundException(final String message){ //TODO configurar ControllerAdvice para retornar 404 na controller
    super(message);
  }

}
