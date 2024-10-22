package com.company.cliente;

/**
 *
 * @author Santos
 */
public class Produto {

    int id;
    private String categoria;
    private String descricao;
    private double preco;

    public Produto(int id, String categoria, String descricao, double preco) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getid() {
        return id;
    }

    public int setId(int id) {
        return this.id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String setDescricao(String descricao) {
        return this.descricao;
    }

    public double getPreco() {
        return preco;
    }

    public double setPreco() {
        return this.preco;
    }

    public String getDescricaoProduto() {
        return "ID:" + id + "\n"
                + "Categoria: " + categoria + "\n"
                + "Produto: " + descricao + "\n"
                + "Preco: " + preco;
    }

}
