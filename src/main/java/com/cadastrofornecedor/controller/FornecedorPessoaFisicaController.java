package com.cadastrofornecedor.controller;

import com.cadastrofornecedor.domain.dto.FornecedorPessoaFisicaDTO;
import com.cadastrofornecedor.service.FornecedorPessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores/pessoafisica")
public class FornecedorPessoaFisicaController {

    @Autowired
    private FornecedorPessoaFisicaService service;

    @PostMapping
    public void post(FornecedorPessoaFisicaDTO dto) {
        try {
            service.save(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
