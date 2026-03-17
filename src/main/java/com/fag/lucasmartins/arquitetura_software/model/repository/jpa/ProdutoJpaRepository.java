package com.fag.lucasmartins.arquitetura_software.model.repository.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;

@Repository
public interface ProdutoJpaRepository extends JpaRepository<ProdutoEntity, Long> {

}
