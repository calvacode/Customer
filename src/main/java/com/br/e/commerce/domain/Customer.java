package com.br.e.commerce.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

  private String cpf;

  private String name;

  private String lastName;


}
