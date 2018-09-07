package com.br.e.commerce.gateway.http.controller;

import com.br.e.commerce.gateway.http.converter.CustomerJsonToCustomerConverter;
import com.br.e.commerce.gateway.http.json.CustomerJson;
import com.br.e.commerce.usecase.CrudCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerJsonToCustomerConverter customerJsonToCustomerConverter;

  private final CrudCustomer crudCustomer;

  @PostMapping
  public void create(@RequestBody final CustomerJson customerJson){
    crudCustomer.create(customerJsonToCustomerConverter.convert(customerJson));
  }
}
