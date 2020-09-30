package br.maua.test;
import br.maua.*;
import br.maua.enums.Tipo;
import br.maua.models.JikanAPI;

public class TestJSON {
    public static void main(String[] args) throws Exception {
        Tipo tipoTeste = Tipo.ANIME;
        String nomeTeste = "dororo";
        System.out.println(JikanAPI.getFirstSearchResult(tipoTeste,nomeTeste));
    }
}
