package models;

public class Produto {
    private static int total = 0;
    private double valor;
    private String descricao;
    private int quantidade;
    private int ID;

    public Produto(double valor, String descricao, int quantidade) {
        total++;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.ID = total;
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

    
    @Override
    public String toString() {
        return "Produto [ID=" + ID + ", descricao=" + descricao + ", quantidade=" + quantidade + ", valor=" + valor
                + "]";
    }

    
}