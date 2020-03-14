package Exercicio1;

import java.util.Scanner;

/**
 * Jogador
 */
public class Jogador {
    Scanner scanner = new Scanner(System.in);

    public String nome = "padrao";
    public Jogada jogada = new Jogada();
    

    void cadastrarJogador(){
        System.out.println("Qual seu nome, jogador? ");
        this.nome = scanner.nextLine();
        
    }

}