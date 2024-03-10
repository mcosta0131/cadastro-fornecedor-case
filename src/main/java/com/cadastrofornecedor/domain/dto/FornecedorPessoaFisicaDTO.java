package com.cadastrofornecedor.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FornecedorPessoaFisicaDTO extends FornecedorBaseDTO{
    private String cpf;
}
