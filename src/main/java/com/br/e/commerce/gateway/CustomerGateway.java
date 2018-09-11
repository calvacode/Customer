package com.br.e.commerce.gateway;

import com.br.e.commerce.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerGateway {

  void create(Customer customer);

}
