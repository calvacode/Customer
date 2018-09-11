package com.br.e.commerce.gateway.http.json;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerJson {

  private String cpf;

  private String name;

  private String lastName;

}
