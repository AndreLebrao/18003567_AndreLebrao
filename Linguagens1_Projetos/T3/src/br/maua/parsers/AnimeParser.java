package br.maua.parsers;

import br.maua.models.Anime;
import org.json.JSONObject;

/**
 * Responsavel pela transformacao do objeto json em um objeto do tipo anime
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */

public class AnimeParser {
    /**
     * Transforma um objeto json em um objeto Anime
     * @param json Objeto json que tem os dados de um anime
     * @return Objeto do tipo anime
     */
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
