package Exercicio1;

import java.util.Scanner;

/**
 * Main
 */
public class Setup {

    Scanner scanner = new Scanner(System.in);
    
    public int escolha;
    
    void iniciar(){
        System.out.println("Escolha qual jogo: \nPedra-Papel-Tesoura (1)\nRock-Paper-Scissor-Lizard-Spoke (2)");
        escolha = scanner.nextInt();
        boolean escolhaValida = false;

        while (!escolhaValida) {
            switch (escolha) {
                case 1:
                    escolhaValida = true;
                    Jogo jogo = new Jogo();
                    jogo.player1.cadastrarJogador();
                    jogo.player1.jogada.cadastrarJogada();
                    jogo.player2.cadastrarJogador();
                    jogo.player2.jogada.cadastrarJogada();

                    
                    break;
            
                case 2:
                escolhaValida = false;
                    JogoLS jogoLS = new JogoLS();
                    break;
            }
        }   
    
    }

}