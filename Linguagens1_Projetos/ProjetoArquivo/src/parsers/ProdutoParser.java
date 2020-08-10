package parsers;

import org.json.JSONObject;

import models.Produto;

public class ProdutoParser {
    public static JSONObject toJson(Produto produto){
        JSONObject json = new JSONObject();
        json.put("valor", produto.getValor());
        json.put("descricao", produto.getDescricao());
        json.put("quantidade", produto.getQuantidade());
        return json;
    }

    public static Produto fromJson(JSONObject json){
        Produto produto = new Produto(json.getDouble("valor"),json.getString("descricao"),json.getInt("quantidade"));
        return produto;
    }
}

