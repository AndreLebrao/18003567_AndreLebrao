package br.maua.models;

public class Anime {
    private String URL;
    private String nome;
    private String sinopse;
    private int quantEp;
    private Double nota;

    public String getURL() {
        return URL;
    }

    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getQuantEp() {
        return quantEp;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "URL='" + URL + '\'' +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", quantEp='" + quantEp + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }

    public Anime(String URL, String nome, String sinopse, int quantEp, Double nota) {
        this.URL = URL;
        this.nome = nome;
        this.sinopse = sinopse;
        this.quantEp = quantEp;
        this.nota = nota;
    }
}
