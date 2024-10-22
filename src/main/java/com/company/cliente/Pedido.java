package com.company.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santos
 */
public class Pedido {

    private Cliente cliente;
    private Date dataPedido;
    private List<ItemPedido> itemPedido;
    private double valorTotal;

    public Pedido(Cliente cliente, Date dataPedido) {
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.itemPedido = new ArrayList<>();

    }

    public void adicionarItem(Produto produto, int quantidade) {
        itemPedido.add(new ItemPedido(produto, quantidade));
        valorTotal += produto.getPreco() * quantidade;

    }

    public void setCliente() {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setItemPedido(List<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }

    public List<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
