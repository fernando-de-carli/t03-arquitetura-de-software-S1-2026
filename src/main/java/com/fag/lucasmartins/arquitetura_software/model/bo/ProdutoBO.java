package com.fag.lucasmartins.arquitetura_software.model.bo;

public class ProdutoBO {

    private Long id;
    private String nome;
    private Integer estoque;
    private double preco;

    public void validarRegras(){
        if(nome != null && nome.toLowerCase().contains("premium")){
            if(preco < 100.0){
                throw new RuntimeException("Erro: o produto premium não podem custar menos de R$100,00.!");
            }
        }
    }
    
    public void aplicarDescontoAtacado(){
        if(estoque != null && estoque >=50){
            this.preco = this.preco * 0.90;
        }
    }
    
    public ProdutoBO() {
    }

    public ProdutoBO(Long id, String nome, Integer estoque, double preco) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
