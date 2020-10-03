package br.maua.models;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import br.maua.enums.Tipo;
import org.json.JSONObject;
import org.json.JSONArray;



public class JikanAPI {

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

    public static void leituraJava11(String inUrl) throws Exception{
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create(inUrl))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code: "+response.statusCode());
        System.out.println("Recebidos");
        System.out.println(response.body());
    }

}
