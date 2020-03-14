package Exercicio1;

import java.util.Scanner;

/**
 * Debug_jogo
 */
public class Debug_jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.player1.cadastrarJogador();
        jogo.player2.cadastrarJogador();
        jogo.player1.jogada.cadastrarJogada();
        
        
        scanner.close();
    }
}