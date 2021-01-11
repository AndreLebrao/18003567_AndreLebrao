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
     * @return URL do poster do manga
     */
    public String getURL() {
        return URL;
    }

    /**
     *
     * @return Nome do manga
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return Sinopse do manga
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     *
     * @return Quantidade de capitulos do manga
     */
    public int getQuantCap() {
        return quantCap;
    }

    /**
     *
     * @return Quantidade de volumes do manga
     */
    public int getQuantVol() {
        return quantVol;
    }

    /**
     *
     * @return Tipo do manga (Manga, Novel, etc.)
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @return Nota do manga
     */
    public Double getNota() {
        return nota;
    }

    /**
     * Construtor da classe Manga
     *
     * @param URL URL do poster do manga
     * @param nome Nome do manga
     * @param sinopse Sinopse do manga
     * @param quantCap Quantidade de capitulos que o manga tem
     * @param quantVol Quantidade de volumes que o manga tem
     * @param tipo Se e manga, novel, etc.
     * @param nota Nota do manga no site
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
