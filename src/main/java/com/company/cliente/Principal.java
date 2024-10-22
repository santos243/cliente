package com.company.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santos
 */
public class Principal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        List<Produto> produtos = new ArrayList<>();

        List<Pedido> pedidos = new ArrayList<>();

        Cliente cliente1 = new Cliente(1, "PF", "123.456.789-00", "Joao Silva", new Date(), true);
        Cliente cliente2 = new Cliente(2, "PJ", "Empresa Alencar Automoveis", "12.345.678/0001-99", "Alencar Dias", new Date(), true);
        Cliente cliente3 = new Cliente(3, "PF", "008.598.130-37", "Arthur Santos", new Date(), true);
        Cliente cliente4 = new Cliente(4, "PJ", "Empresa Cortadora de Verde", "12.543.598/0001-10", "Corta Tudo", new Date(), true);
        Cliente cliente5 = new Cliente(5, "PF", "063.836.400-03", "Arthur Dos Santos", new Date(), true);
        Cliente cliente6 = new Cliente(6, "PF", "009.256.096-27", "Carlos Eduardo", new Date(), true);

        Produto smartphone = new Produto(101, "Eletronico", "Samsung S20 FE", 1850.0);
        Produto microondas = new Produto(102, "Eletrodomestico", "Microondas", 650.0);
        Produto cortadordegrama = new Produto(103, "Marcenaria", "Cortador de grama", 1460.0);
        Produto serraeletrica = new Produto(104, "Marcenaria", "Serra Eletrica", 400.0);
        Produto cadeiragamer = new Produto(105, "Moveis", "Cadeira Gamer", 800.0);

        Pedido pedido1 = new Pedido(cliente1, new Date());
        pedido1.adicionarItem(cortadordegrama, 2);
        pedido1.adicionarItem(smartphone, 3);

        Pedido pedido2 = new Pedido(cliente2, new Date());
        pedido2.adicionarItem(smartphone, 4);
        pedido2.adicionarItem(serraeletrica, 5);

        Pedido pedido3 = new Pedido(cliente3, new Date());
        pedido3.adicionarItem(cortadordegrama, 6);

        Pedido pedido4 = new Pedido(cliente2, new Date());
        pedido4.adicionarItem(smartphone, 5);
        pedido4.adicionarItem(microondas, 7);

        Pedido pedido5 = new Pedido(cliente4, new Date());
        pedido5.adicionarItem(serraeletrica, 6);
        pedido5.adicionarItem(cortadordegrama, 4);

        Pedido pedido6 = new Pedido(cliente6, new Date());
        pedido6.adicionarItem(smartphone, 4);
        pedido6.adicionarItem(serraeletrica, 7);
        pedido6.adicionarItem(cortadordegrama, 8);
        pedido6.adicionarItem(microondas, 6);

        produtos.add(smartphone);
        produtos.add(microondas);
        produtos.add(cortadordegrama);
        produtos.add(serraeletrica);
        produtos.add(cadeiragamer);

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);
        pedidos.add(pedido6);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);

        System.out.println("Informacoes dos produtos");
        for (Produto produtoFor : produtos) {
            produtoFor.getDescricaoProduto();
            System.out.println(produtoFor.getDescricaoProduto() + "\n");
        }

        System.out.println("Informacoes dos clientes\n");
        for (Cliente clienteFor : clientes) {
            clienteFor.getDescricaoCliente();
            System.out.println(clienteFor.getDescricaoCliente());
        }

        System.out.println("\n Informacoes dos pedidos");

        for (Pedido pedidoFor : pedidos) {
            pedidoFor.getCliente().getDescricaoCliente2();
            System.out.println(pedidoFor.getCliente().getDescricaoCliente2());
            for (ItemPedido itemPedido : pedidoFor.getItemPedido()) {
                System.out.println(itemPedido.toString());
            }
        }
    }
}
