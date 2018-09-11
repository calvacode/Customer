package com.br.e.commerce.gateway.http.controller;

import com.br.e.commerce.domain.Customer;
import com.br.e.commerce.gateway.http.converter.CustomerJsonToCustomerConverter;
import com.br.e.commerce.gateway.http.converter.CustomerToCustomerJsonConverter;
import com.br.e.commerce.gateway.http.json.CustomerJson;
import com.br.e.commerce.usecase.CrudCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

  private final CustomerJsonToCustomerConverter customerJsonToCustomerConverter;
  private final CustomerToCustomerJsonConverter customerToCustomerJsonConverter;

  private final CrudCustomer crudCustomer;

  @PostMapping
  public void create(@RequestBody final CustomerJson customerJson){

    final Customer customer = customerJsonToCustomerConverter.convert(customerJson);
    crudCustomer.create(customer);
  }

  @GetMapping("/{cpf}")
  public CustomerJson findCustomer(@PathVariable(name = "cpf") final String cpf){
    final Customer customer = crudCustomer.findCustomer(cpf);
    return customerToCustomerJsonConverter.convert(customer);
  }
}
