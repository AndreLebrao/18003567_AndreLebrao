package Exercicio1;

import java.util.Scanner;

/**
 * Debug_jogo
 */
public class Debug_jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jogador player1 = new Jogador();
        player1.cadastrarJogador();
        player1.jogada.escolherJogada();
        scanner.close();
    }
}