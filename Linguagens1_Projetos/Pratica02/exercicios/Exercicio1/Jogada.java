package Exercicio1;

import java.util.Scanner;

/**
 * Resultados
 */

public class Jogada {

    public boolean pedra = false;
    public boolean papel = false;
    public boolean tesoura = false;

    /**
     * 
     * @return "pedra", "papel" ou 
     */
    String escolherJogada(){
        System.out.println("Escolha sua jogada (pedra/papel/tesoura): ");
        Scanner scanner = new Scanner(System.in);
        

        scanner.close();
    }
    
}