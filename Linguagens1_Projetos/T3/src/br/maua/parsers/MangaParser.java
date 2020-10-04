package br.maua.parsers;
import br.maua.models.Manga;
import org.json.JSONObject;


/**
 * Responsavel pela transformacao do objeto json em um objeto do tipo manga
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */
public class MangaParser {
    /**
     * Transforma um objeto json em um objeto Manga
     * @param json Objeto json que tem os dados de um manga
     * @return Objeto do tipo manga
     */
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
