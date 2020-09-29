package br.maua.parsers;
import br.maua.models.Manga;
import org.json.JSONObject;

public class MangaParser {

    public static Manga fromJSON(JSONObject json){
        Manga manga = new Manga(
                json.getString("image_url"),
                json.getString("title"),
                json.getString("synopsis"),
                json.getInt("chapters"),
                json.getInt("volumes"),
                json.getString("type"),
                json.getDouble("score")
        );
        return manga;
    }
}
