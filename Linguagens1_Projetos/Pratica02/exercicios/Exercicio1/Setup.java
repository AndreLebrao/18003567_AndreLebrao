package Exercicio1;

import java.util.Scanner;

/**
 * Main
 */
public class Setup {

    Scanner scanner = new Scanner(System.in);
    
    public int escolha;
    
    void iniciar(){
        boolean escolhaValida = false;

        while (!escolhaValida) {
            System.out.println("Escolha qual jogo: \nPedra-Papel-Tesoura (1)\nRock-Paper-Scissor-Lizard-Spoke (2)");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    escolhaValida = true;
                    Jogo jogo = new Jogo();
                    jogo.player1.cadastrarJogador();
                    jogo.player1.jogada.cadastrarJogada();
                    jogo.player2.cadastrarJogador();
                    jogo.player2.jogada.cadastrarJogada();
                    jogo.Jokenpo();
                    break;
            
                case 2:
                    escolhaValida = true;
                    JogoLS jogoLS = new JogoLS();
                    jogoLS.player1.cadastrarJogador();
                    jogoLS.player1.jogada.cadastrarJogada();
                    jogoLS.player2.cadastrarJogador();
                    jogoLS.player2.jogada.cadastrarJogada();
                    jogoLS.JokenpoLS();
                    break;
            }
            if(!escolhaValida){
                System.out.println("Escolha não válida");
            }
        }   
    
    }

}