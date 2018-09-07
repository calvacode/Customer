package com.br.e.commerce.gateway.http.converter;

import com.br.e.commerce.domain.Customer;
import com.br.e.commerce.gateway.http.json.CustomerJson;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerJsonToCustomerConverter implements Converter<CustomerJson, Customer> {

  @Override
  public Customer convert(CustomerJson customerJson) {
    return Customer.builder()
        .name(customerJson.getName())
        .lastName(customerJson.getLastName())
        .build();
  }
}
