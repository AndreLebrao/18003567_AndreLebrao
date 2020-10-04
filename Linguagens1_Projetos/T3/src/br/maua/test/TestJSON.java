package br.maua.test;
import br.maua.*;
import br.maua.enums.Tipo;
import br.maua.models.Anime;
import br.maua.models.JikanAPI;
import br.maua.parsers.AnimeParser;
import org.json.JSONObject;

public class TestJSON {
    public static void main(String[] args) throws Exception {
        Tipo tipoTeste = Tipo.ANIME;
        String nomeTeste = "Boku no Hero Academia";
        JSONObject json = JikanAPI.getFirstSearchResult(tipoTeste,nomeTeste);
        System.out.println(json);
        Anime anime = AnimeParser.fromJSON(json);
        System.out.println(anime);
    }
}
