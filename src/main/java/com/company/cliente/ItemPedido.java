package com.company.cliente;

/**
 *
 * @author Santos
 */
public class ItemPedido {

    private int quantidade;

    private Produto produto;

    private double valorTotal;

    //private String pedido;
    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
        valorTotal += produto.getPreco() * quantidade;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "\n"
                + "\t" + "Quantidade: " + quantidade + "\n"
                + "\t" + "Produto: " + produto.getDescricao() + "\n"
                + "\t" + "Valor Total: " + valorTotal;

    }

}
