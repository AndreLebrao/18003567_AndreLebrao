package Exercicio1;

import java.util.Scanner;

/**
 * Jogador
 */
public class Jogador {

    public String nome = "padrao";
    public Jogada jogada = new Jogada();
    

    void cadastrarJogador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome, jogador? ");
        this.nome = scanner.nextLine();
        scanner.close();
    }
}