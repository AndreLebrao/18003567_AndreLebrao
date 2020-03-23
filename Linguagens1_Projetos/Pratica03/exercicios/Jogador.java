public class Jogador {
    private String nome;
    private Jogada jogada;
    //Builder
    public Jogador(String nome, String escolha){
        this.nome = nome;
        jogada = new Jogada(escolha);
    }
    //EndBuilder
    public Jogada getJogada(){
        return jogada;
    }
    public String competicao(Jogador player2){
        return jogada.avaliar(player2.getJogada());
    }
}