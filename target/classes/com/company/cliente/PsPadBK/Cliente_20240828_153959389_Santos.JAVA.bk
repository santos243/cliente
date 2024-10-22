package com.company.cliente;

import java.util.Date;

/**
 *
 * @author Santos
 */
public class Cliente {
//adicionar os atributos, construtores e metodos do objeto

    int id;
    private String tipoCadastro;
    private String documento;
    private String nome;
    private String razaoSocial;
    private String nomeFantasia;
    private Date dataCadastro;
    private boolean ativo;

    public Cliente(int id, String tipoCadastro, String documento, String nome, Date dataCadastro, boolean ativo) {
        this.ativo = ativo;
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.dataCadastro = dataCadastro;
        this.tipoCadastro = tipoCadastro;
    }

    public Cliente(int id, String tipoCadastro, String razaoSocial, String documento, String nomeFantasia, Date dataCadastro, boolean ativo) {
        this.ativo = ativo;
        this.razaoSocial = razaoSocial;
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.dataCadastro = dataCadastro;
        this.documento = documento;
        this.tipoCadastro = tipoCadastro;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoCadastro(String tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getId() {
        return this.id;

    }

    public String getTipoCadastro() {
        return tipoCadastro;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFatasia() {
        return nomeFantasia;
    }

    public Date dataCadastro() {
        return dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getDescricaoCliente() {
        if (tipoCadastro.equals("PF")) {
            return "\n"
                    + "Tipo cadastro: " + tipoCadastro + "\n"
                    + "nome: " + nome + "\n"
                    + "CPF: " + documento + "\n"
                    + "Data de cadastro: " + dataCadastro + "\n"
                    + "Ativo/Inativo: " + ativo;

        } else if (tipoCadastro.equals("PJ")) {
            return "\n"
                    + "Tipo cadastro: " + tipoCadastro + "\n"
                    + "Razao Social: " + razaoSocial + "\n"
                    + "CNPJ: " + documento + "\n"
                    + "Nome fantasia: " + nomeFantasia + "\n"
                    + "Data de cadastro: " + dataCadastro + "\n"
                    + "Ativo/Inativo: " + ativo;

        }
        return "";

    }

    public String getDescricaoCliente2() {
        if (tipoCadastro.equals("PF")) {
            return "\n"
                    + "Nome: " + nome + "\n"
                    + "CPF: " + documento + "\n"
                    + "Itens pedidos: " + "\n";
        } else if (tipoCadastro.equals("PJ")) {
            return "\n"
                    + "Nome fantasia: " + nomeFantasia + "\n"
                    + "CNPJ: " + documento + "\n"
                    + "Itens pedidos:";

        }
        return "";
    }

}
