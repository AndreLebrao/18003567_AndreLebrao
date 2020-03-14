package Exercicio1;

/**
 * JogoLP
 */
public class JogoLS {

    public JogadorLS player1 = new JogadorLS();
    public JogadorLS player2 = new JogadorLS();

    void JokenpoLS(){

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
                    case 4:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 5:
                        System.out.println(this.player2.nome+" ganhou!");
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
                    case 4:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 5:
                        System.out.println(this.player1.nome+" ganhou!");
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
                    case 4:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 5:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                }
                break;
            case 4:
                    switch(this.player2.jogada.codigoJogada){
                    case 1:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 2:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 3:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 4:
                        System.out.println("Empate!");
                        break;
                    case 5:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                }
            case 5:
                    switch(this.player2.jogada.codigoJogada){
                    case 1:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 2:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 3:
                        System.out.println(this.player1.nome+" ganhou!");
                        break;
                    case 4:
                        System.out.println(this.player2.nome+" ganhou!");
                        break;
                    case 5:
                        System.out.println("Empate!");
                        break;
                }
                break;

            default:
                break;
        }
    }
}