package com.br.e.commerce.gateway.http.converter;


import com.br.e.commerce.domain.Customer;
import com.br.e.commerce.gateway.http.json.CustomerJson;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerToCustomerJsonConverter implements Converter<Customer, CustomerJson> {

  @Override
  public CustomerJson convert(final Customer customer) {
    return CustomerJson.builder()
        .name(customer.getName())
        .lastName(customer.getLastName())
        .cpf(customer.getCpf())
        .build();
  }
}
