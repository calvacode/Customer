package com.br.e.commerce.gateway.mongo;

import com.br.e.commerce.domain.Customer;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

  Optional<Customer> findCustomerByCpf(String cpf);

}
