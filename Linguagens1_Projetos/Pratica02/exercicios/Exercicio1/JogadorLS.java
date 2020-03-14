package Exercicio1;

import java.util.Scanner;

/**
 * JogadorLS
 */
public class JogadorLS {
    Scanner scanner = new Scanner(System.in);

    public String nome = "padrao";
    public JogadaLS jogada = new JogadaLS();
    

    void cadastrarJogador(){
        System.out.println("Qual seu nome, jogador? ");
        this.nome = scanner.nextLine();
        
    }
    
}