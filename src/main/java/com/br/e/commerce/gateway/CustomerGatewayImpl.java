package com.br.e.commerce.gateway;

import com.br.e.commerce.domain.Customer;
import com.br.e.commerce.gateway.mongo.CustomerRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway{

  private final CustomerRepository customerRepository;

  public void create(final Customer customer){
    customerRepository.save(customer);
  }

  @Override
  public Optional<Customer> findCustomerByCpf(String cpf) {
    return customerRepository.findCustomerByCpf(cpf);
  }

}
