package com.cadastrofornecedor.repository;

import com.cadastrofornecedor.domain.entity.FornecedorPessoaFisicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorPessoaFisicaRepository extends JpaRepository<FornecedorPessoaFisicaEntity, Long> {
}
