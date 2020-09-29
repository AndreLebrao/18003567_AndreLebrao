package br.maua.parsers;

import br.maua.models.Anime;
import org.json.JSONObject;

public class AnimeParser {
    public static Anime fromJSON(JSONObject json){
        Anime anime = new Anime(
                json.getString("image_url"),
                json.getString("title"),
                json.getString("synopsis"),
                json.getInt("episodes"),
                json.getDouble("score")
        );
        return anime;

    }
}
