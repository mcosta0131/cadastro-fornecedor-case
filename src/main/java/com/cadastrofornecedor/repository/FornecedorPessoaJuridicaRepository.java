package com.cadastrofornecedor.repository;

import com.cadastrofornecedor.domain.entity.FornecedorPessoaJuridicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorPessoaJuridicaRepository extends JpaRepository<FornecedorPessoaJuridicaEntity, Long> {
}
