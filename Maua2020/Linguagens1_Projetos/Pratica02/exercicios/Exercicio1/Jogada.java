package Exercicio1;

import java.util.Scanner;

/**
 * Resultados
 */

public class Jogada {

    public boolean pedra = false;
    public boolean papel = false;
    public boolean tesoura = false;
    public int codigoJogada = 0;
    Scanner scanner = new Scanner(System.in);

    /** Troca o estado de somente um dos atributos dependendo do input
     * 
     * 
     */
    void cadastrarJogada(){
        boolean escolhaValida = false;

        while (!escolhaValida) {
            System.out.println("Digite sua jogada: ");
            String escolha = scanner.nextLine();
        if (escolha.equalsIgnoreCase("pedra")){
            this.pedra = true;
            this.codigoJogada = 1;
            escolhaValida = true;
        }
        if (escolha.equalsIgnoreCase("papel")){
            this.papel = true;
            this.codigoJogada = 2;
            escolhaValida = true;
        }
        if (escolha.equalsIgnoreCase("tesoura")){
            this.tesoura = true;
            this.codigoJogada = 3;
            escolhaValida = true;  
        }
        if(!escolhaValida)
        System.out.println("Escolha não válida");
        
        }
    }

}