package com.cadastrofornecedor.service;

import com.cadastrofornecedor.domain.dto.FornecedorPessoaJuridicaDTO;
import com.cadastrofornecedor.domain.entity.FornecedorPessoaJuridicaEntity;
import com.cadastrofornecedor.repository.FornecedorPessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorPessoaJuridicaService
        extends GenericService<FornecedorPessoaJuridicaDTO, FornecedorPessoaJuridicaEntity> {

    @Autowired
    public FornecedorPessoaJuridicaService(FornecedorPessoaJuridicaRepository repository) {
        super(repository);
    }
}
