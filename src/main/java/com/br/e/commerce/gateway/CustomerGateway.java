package com.br.e.commerce.gateway;

import com.br.e.commerce.domain.Customer;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerGateway {

  void create(Customer customer);

  Optional<Customer> findCustomerByCpf(String cpf);
}
