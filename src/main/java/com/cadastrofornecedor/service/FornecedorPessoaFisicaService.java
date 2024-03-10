package com.cadastrofornecedor.service;

import com.cadastrofornecedor.domain.dto.FornecedorPessoaFisicaDTO;
import com.cadastrofornecedor.domain.entity.FornecedorPessoaFisicaEntity;
import com.cadastrofornecedor.repository.FornecedorPessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorPessoaFisicaService extends GenericService<FornecedorPessoaFisicaDTO, FornecedorPessoaFisicaEntity>{
    @Autowired
    public FornecedorPessoaFisicaService(FornecedorPessoaFisicaRepository repository) {
        super(repository);
    }
}
