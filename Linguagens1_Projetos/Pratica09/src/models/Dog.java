package models;

public class Dog {
    private String nome;
    private String raca;
    private int peso;

    public Dog(String nome, String raca, int peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Dog [nome=" + nome + ", peso=" + peso + ", raca=" + raca + "]";
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }
    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }
}