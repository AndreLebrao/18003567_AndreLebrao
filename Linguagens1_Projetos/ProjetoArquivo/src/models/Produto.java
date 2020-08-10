package models;

public class Produto {
    private double valor;
    private String descricao;
    private int quantidade;

    public Produto(double valor, String descricao, int quantidade) {
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}