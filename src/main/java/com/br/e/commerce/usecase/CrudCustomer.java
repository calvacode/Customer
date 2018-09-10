package com.br.e.commerce.usecase;

import com.br.e.commerce.domain.Customer;
import com.br.e.commerce.gateway.CustomerGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudCustomer {

  private final CustomerGateway customerGateway;

  public void create(final Customer customer){
    customerGateway.create(customer);
  }

}
