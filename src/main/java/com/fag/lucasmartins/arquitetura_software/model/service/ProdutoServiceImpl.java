package com.fag.lucasmartins.arquitetura_software.model.service;

import org.springframework.stereotype.Service;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
    
@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProdutoBO cadastrarProduto(ProdutoBO produtoBO) {

        produtoBO.validarRegras();
        produtoBO.aplicarDescontoAtacado();

        return repository.salvar(produtoBO);
    }
}