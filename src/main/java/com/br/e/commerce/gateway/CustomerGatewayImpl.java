package com.br.e.commerce.gateway;

import com.br.e.commerce.domain.Customer;
import com.br.e.commerce.gateway.mongo.CustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway{

  private final CustomerRepository customerRepository;

  public void create(final Customer customer){
    customerRepository.save(customer);
  }

}
