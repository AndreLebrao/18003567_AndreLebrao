package Exercicio1;

import java.util.Scanner;

/**
 * Main
 */
public class Setup {

    Scanner scanner = new Scanner(System.in);
    
    public int escolha;
    
    void EscolherJogo(){
        System.out.println("Escolha qual jogo: \nPedra-Papel-Tesoura (1)\nRock-Paper-Scissor-Lizard-Spoke (2)");
        escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                Jogo jogo = new Jogo();
                break;
        
            case 2:
                JogoLS jogoLS = new JogoLS();
                break;
        }
    }
}