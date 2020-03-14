package Exercicio1;

import java.util.Scanner;

/**
 * Debug_jogo
 */
public class Debug_jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.player1.nome = "andre";
        jogo.player2.nome = "jatobas";
        jogo.player1.jogada.codigoJogada = 1;
        jogo.player2.jogada.codigoJogada = 1;
        jogo.comecarJokenpo();
        
        scanner.close();
    }
}