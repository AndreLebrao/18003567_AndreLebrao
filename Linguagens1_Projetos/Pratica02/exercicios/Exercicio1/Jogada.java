package Exercicio1;

import java.util.Scanner;

/**
 * Resultados
 */

public class Jogada {

    public boolean pedra = false;
    public boolean papel = false;
    public boolean tesoura = false;
    Scanner scanner = new Scanner(System.in);

    /** Troca o estado de somente um dos atributos dependendo do input
     * 
     * 
     */
    void cadastrarJogada(){

        System.out.println("Digite sua jogada: ");
        String escolha = scanner.nextLine();
        System.out.println(escolha);
        // escolha.toLowerCase();
        // escolha.replaceAll(" ", "");
        if (escolha.equalsIgnoreCase("pedra"))
            this.pedra = true;   
        if (escolha.equalsIgnoreCase("papel"))
            this.papel = true;   
        if (escolha.equalsIgnoreCase("tesoura"))
            this.tesoura = true;   
            
        else
        System.out.println("Escolha não válida");
        
    }

}