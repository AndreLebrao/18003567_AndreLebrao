package br.maua.models;

/**
 * Classe do modelo de anime <br>
 * Inclui somente construtor, getters e toString
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */

public class Anime {
    private String URL;
    private String nome;
    private String sinopse;
    private int quantEp;
    private Double nota;

    // TODO ver uso dos getters pos implemetacao de DAO

    /**
     * @return URL do poster do anime
     */
    public String getURL() {
        return URL;
    }

    /**
     * @return Nome do anime
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return Sinopse do anime
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @return Quantidade de episodios do anime
     */
    public int getQuantEp() {
        return quantEp;
    }

    /**
     * @return Nota do anime
     */
    public Double getNota() {
        return nota;
    }

    /**
     * @return String com representacao de todas variaveis da classe
     */
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
    /**
     * Construtor da classe Anime
     * @param URL url do poster do anime
     * @param nome nome do anime
     * @param sinopse sinopse do anime
     * @param quantEp quantidade de episodios que o anime tem
     * @param nota nota do anime no site
     *
     */
    public Anime(String URL, String nome, String sinopse, int quantEp, Double nota) {
        this.URL = URL;
        this.nome = nome;
        sinopse = sinopse.replace("\"","\"\"");
//        sinopse = sinopse.replace("\"","\'");
        this.sinopse = sinopse;
        this.quantEp = quantEp;
        this.nota = nota;
    }
}
