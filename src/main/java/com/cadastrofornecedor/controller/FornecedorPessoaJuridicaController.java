package com.cadastrofornecedor.controller;

import com.cadastrofornecedor.domain.dto.FornecedorPessoaFisicaDTO;
import com.cadastrofornecedor.domain.dto.FornecedorPessoaJuridicaDTO;
import com.cadastrofornecedor.service.FornecedorPessoaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores/pessoajuridica")
public class FornecedorPessoaJuridicaController {

    @Autowired
    private FornecedorPessoaJuridicaService service;

    @PostMapping
    public void post(FornecedorPessoaJuridicaDTO dto) {
        try {
            service.save(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
