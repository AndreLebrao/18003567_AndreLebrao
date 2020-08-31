package br.maua.models;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;
    private String id;

    public Venda(Vendedor vendedor, Cliente cliente, Produto produto) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
    }
}
