package br.maua.dao;

import br.maua.models.Anime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe modelo de Anime<br>
 *     Implementa interfaces DAO e DAOFields
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */
public class AnimeDAO  implements DAO<Anime>,DAOFields{
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:weeb.db";

    /**
     * Construtor da classe modelo de AnimeDAO<br>
     *     Inicia a conexao com SQL
     */
    public AnimeDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Classe de retorno de lista
     * @return Lista de animes
     */
    @Override
    public List<Anime> getAll() {
        List<Anime> animes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                Anime anime = new Anime(
                        result.getString("url"),
                        result.getString("nome"),
                        result.getString("sinopse"),
                        result.getInt("quantEp"),
                        result.getDouble("nota")
                );
                animes.add(anime);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return animes;
    }

    /**
     * Classe que ira adicionar um novo anime no banco de dados
     * @param anime O anime para ser adicionado no banco de dados
     */
    @Override
    public void create(Anime anime) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1,anime.getURL());
            preparedStatement.setString(2,anime.getNome());
            preparedStatement.setString(3,anime.getSinopse());
            preparedStatement.setInt(4,anime.getQuantEp());
            preparedStatement.setDouble(5,anime.getNota());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    /**
     * Metodo que ira verificar a existencia de um anime na tabela no banco de dados
     * @param novoNome Nome do novo anime
     * @return true se ja existir anime no banco, false se nao existir
     */
    @Override
    public boolean isinDB(String novoNome) {
        List<Anime> animes = getAll();
        for(Anime anime: animes){
            if(anime.getNome().equals(novoNome)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return Nome da tabela (anime)
     */
    @Override
    public String getTableName() {
        return "anime";
    }

    /**
     *
     * @param table Nome da tabela
     * @return Frase usada em SQL para adicionar um novo elemento na tabela
     */
    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+table +" (url,nome,sinopse,quantEp,nota) VALUES (?,?,?,?,?);";
    }

    /**
     *
     * @param table Nome da tabela
     * @return Frase usada em SQL para recuperar os dados da tabela
     */
    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }
}
