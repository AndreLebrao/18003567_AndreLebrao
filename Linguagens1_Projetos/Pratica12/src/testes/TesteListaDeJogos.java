package testes;

import models.Jogo;
import models.ListaDeJogos;

public class TesteListaDeJogos {
    public static void main(String[] args) {
        ListaDeJogos jogos = new ListaDeJogos();
        System.out.println("Atual: "+jogos);

        Jogo jogo1 = new Jogo("PC", "LoL");
        Jogo jogo2 = new Jogo("PC", "Diablo 3");
        Jogo jogo3 = new Jogo("PC", "Halo");

        jogos.addJogo(jogo1);
        jogos.addJogo(jogo2);
        jogos.addJogo(jogo3);

        System.out.println("Atual: "+jogos);
    }
}