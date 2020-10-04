package br.maua.dao;

import br.maua.models.Anime;
import br.maua.models.Manga;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MangaDAO implements DAO<Manga>,DAOFields{
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:weeb.db";

    public MangaDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Manga> getAll() {
        List<Manga> mangas = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                Manga manga = new Manga(
                        result.getString("url"),
                        result.getString("nome"),
                        result.getString("sinopse"),
                        result.getInt("quantCap"),
                        result.getInt("quantVol"),
                        result.getString("tipo"),
                        result.getDouble("nota")
                );
                mangas.add(manga);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return mangas;
    }

    @Override
    public void create(Manga manga) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1,manga.getURL());
            preparedStatement.setString(2,manga.getNome());
            preparedStatement.setString(3,manga.getSinopse());
            preparedStatement.setInt(4,manga.getQuantCap());
            preparedStatement.setInt(5,manga.getQuantVol());
            preparedStatement.setString(6,manga.getTipo());
            preparedStatement.setDouble(7,manga.getNota());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "manga";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+table +" (url,nome,sinopse,quantCap,quantVol,tipo,nota) VALUES (?,?,?,?,?,?,?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }
}
