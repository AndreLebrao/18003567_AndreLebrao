package parsers;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Produto;

public class EstoqueParser {
        public static JSONArray toJson(ArrayList<Produto> estoque){
            JSONArray json = new JSONArray();
            estoque.forEach(produto -> {json.put(ProdutoParser.toJson(produto));});
            return json;
        }
        public static ArrayList<Produto> fromJson(JSONArray json){
            ArrayList<Produto> lista = new ArrayList<>();
            json.forEach( item ->{
                lista.add(ProdutoParser.fromJson((JSONObject) item));
            });
            return lista;
        }
    }