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

        jogo.player1.jogada.codigoJogada = 1; //pedra
        jogo.player2.jogada.codigoJogada = 1; //pedra
        jogo.comecarJokenpo();
        jogo.player1.jogada.codigoJogada = 1; //pedra
        jogo.player2.jogada.codigoJogada = 2; //papel
        jogo.comecarJokenpo();
        jogo.player1.jogada.codigoJogada = 1; //pedra
        jogo.player2.jogada.codigoJogada = 3; //tesoura
        jogo.comecarJokenpo();

        System.out.println();

        jogo.player1.jogada.codigoJogada = 2; //papel
        jogo.player2.jogada.codigoJogada = 1; //pedra
        jogo.comecarJokenpo();
        jogo.player1.jogada.codigoJogada = 2; //papel
        jogo.player2.jogada.codigoJogada = 2; //papel
        jogo.comecarJokenpo();
        jogo.player1.jogada.codigoJogada = 2; //papel
        jogo.player2.jogada.codigoJogada = 3; //tesoura
        jogo.comecarJokenpo();

        System.out.println();
        
        jogo.player1.jogada.codigoJogada = 3; //tesoura
        jogo.player2.jogada.codigoJogada = 1; //pedra
        jogo.comecarJokenpo();
        jogo.player1.jogada.codigoJogada = 3; //tesoura
        jogo.player2.jogada.codigoJogada = 2; //papel
        jogo.comecarJokenpo();
        jogo.player1.jogada.codigoJogada = 3; //tesoura
        jogo.player2.jogada.codigoJogada = 3; //tesoura
        jogo.comecarJokenpo();
        
        scanner.close();
    }
}