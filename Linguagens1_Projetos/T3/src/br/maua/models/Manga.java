package br.maua.models;

public class Manga {
    private String URL;
    private String nome;
    private String sinopse;
    private int quantCap;
    private int quantVol;
    private String tipo;
    private Double nota;

    @Override
    public String toString() {
        return "Manga{" +
                "URL='" + URL + '\'' +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", quantCap=" + quantCap +
                ", quantVol=" + quantVol +
                ", tipo='" + tipo + '\'' +
                ", nota=" + nota +
                '}';
    }

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
