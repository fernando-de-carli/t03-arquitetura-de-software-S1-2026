package com.fag.lucasmartins.arquitetura_software.model.repository;

import org.springframework.stereotype.Component;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;
import com.fag.lucasmartins.arquitetura_software.model.repository.jpa.ProdutoJpaRepository;
import com.fag.lucasmartins.arquitetura_software.model.repository.mapper.ProdutoEntityMapper;

@Component
public class ProdutoRepositoryImpl implements ProdutoRepository {

    private final ProdutoJpaRepository jpaRepository;

    public ProdutoRepositoryImpl(ProdutoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ProdutoBO salvar(ProdutoBO bo) {
        ProdutoEntity entity = ProdutoEntityMapper.toEntity(bo);
        ProdutoEntity salvo = jpaRepository.save(entity);
        return ProdutoEntityMapper.toBo(salvo);
    }
}