package Exercicio1;

/**
 * Jogo
 */
public class Jogo {

    public Jogador player1 = new Jogador();
    public Jogador player2 = new Jogador();

    void comecarJokenpo(){

        switch (this.player1.jogada.codigoJogada) {
            case 0:
                System.out.println("0");
                break;
        
            default:
                break;
        }
    }
}