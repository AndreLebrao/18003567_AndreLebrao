package br.maua.dao;

import br.maua.models.Anime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimeDAO  implements DAO<Anime>,DAOFields{
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:weeb.db";

    public AnimeDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //TODO: decidir se a gnt vai usar aquela lista static pra comparar o anime a ser inserido com o banco ou se vamos
    // so dar um getAll()
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

    @Override
    public void create(Anime anime) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1,anime.getURL());
            preparedStatement.setString(2,anime.getNome());
            preparedStatement.setString(3,anime.getSinopse());
            preparedStatement.setInt(4,anime.getQuantEp());
            preparedStatement.setDouble(5,anime.getNota());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

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

    @Override
    public String getTableName() {
        return "anime";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+table +" (url,nome,sinopse,quantEp,nota) VALUES (?,?,?,?,?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }
}
