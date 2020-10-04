package br.maua.models;
/**
 * Classe do modelo de manga <br>
 * Inclui somente construtor, getters e toString
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */

public class Manga {
    private String URL;
    private String nome;
    private String sinopse;
    private int quantCap;
    private int quantVol;
    private String tipo;
    private Double nota;


    /**
     * @return String com representacao de todas variaveis da classe
     */
    @Override
    public String toString() {
        return  "nome: " + nome + "\n" +
                "URL: " + URL + "\n" +
                "sinopse: " + sinopse + "\n" +
                "quantCap: " + quantCap +"\n"+
                "quantVol: " + quantVol +"\n"+
                "tipo: " + tipo + "\n" +
                "nota: " + nota;
    }

    /**
     *
     * @return
     */
    public String getURL() {
        return URL;
    }

    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getQuantCap() {
        return quantCap;
    }

    public int getQuantVol() {
        return quantVol;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getNota() {
        return nota;
    }

    /**
     * Construtor da classe Manga
     *
     * @param URL url do poster do manga
     * @param nome nome do manga
     * @param sinopse sinopse do manga
     * @param quantCap quantidade de capitulos que o manga tem
     * @param quantVol quantidade de volumes que o manga tem
     * @param tipo se eh manga ou anime
     * @param nota nota do manga no site
     *
     */
    public Manga(String URL, String nome, String sinopse, int quantCap, int quantVol, String tipo, Double nota) {
        this.URL = URL;
        this.nome = nome;
        this.sinopse = sinopse;
        this.quantCap = quantCap;
        this.quantVol = quantVol;
        this.tipo = tipo;
        this.nota = nota;
    }
}
