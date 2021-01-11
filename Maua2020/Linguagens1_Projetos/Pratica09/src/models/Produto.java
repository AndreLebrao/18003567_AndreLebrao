package models;

public class Produto {
    private int codigo;
    private String nome;
    private double valor;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + "]";
    }
}