package Exercicio1;

/**
 * Jogo
 */
public class Jogo {

    public Jogador player1 = new Jogador();
    public Jogador player2 = new Jogador();

    void Jokenpo(){

        switch (this.player1.jogada.codigoJogada) {
            case 1:
                switch(this.player2.jogada.codigoJogada){
                    case 1:
                        System.out.println("Empate!");
                        break;
                    case 2:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 3:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                }
                break;
            
            case 2:
                switch(this.player2.jogada.codigoJogada){
                    case 1:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 2:
                        System.out.println("Empate!");
                        break;
                    case 3:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                }
                break;

            case 3:
                    switch(this.player2.jogada.codigoJogada){
                    case 1:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 2:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 3:
                        System.out.println("Empate!");
                        break;
                }
                break;

            default:
                break;
        }
    }
}