package br.maua.models;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import br.maua.enums.Tipo;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 * Responsavel pela criacao do objeto json
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */

public class JikanAPI {

    /**
     * Metodo de procura do nome do anime/manga na API
     * @param tipo Tipo do objeto: Anime ou Manga
     * @param nome Nome do anime ou manga a ser pesquisado
     * @return Primeiro objeto do jsonarray - Ira ser adicionado ao banco de dados
     * @throws Exception
     */
    public static JSONObject getFirstSearchResult(Tipo tipo, String nome) throws Exception {
        nome = nome.replace(" ","%20");
        String inUrl = "https://api.jikan.moe/v3/search/"+tipo.toString()+"?q="+nome;
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create(inUrl))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        //TODO tratar caso de um nome que nao existe
        JSONObject json = new JSONObject(response.body());
        JSONArray jsonArray = (JSONArray) json.get("results");
        return (JSONObject) jsonArray.get(0);
    }

}
