package Exercicio1;


/**
 * Resultados
 */

public class Jogada {

    public boolean pedra = false;
    public boolean papel = false;
    public boolean tesoura = false;

    /** Troca o estado de somente um dos atributos dependendo do input
     * 
     * 
     */
    void escolherJogada(String escolha){
        escolha.toLowerCase();
        escolha.replaceAll(" ", "");
        if (escolha.equals("pedra"))
            this.pedra = true;   
        if (escolha.equals("papel"))
            this.papel = true;   
        if (escolha.equals("tesoura"))
            this.tesoura = true;   
        else
        System.out.println("Escolha não válida");
    }
    
}