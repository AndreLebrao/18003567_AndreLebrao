package br.maua.dao;

import br.maua.models.Anime;
import br.maua.models.Manga;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Classe modelo de Manga<br>
 *     Implementa interfaces DAO e DAOFields
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */
public class MangaDAO implements DAO<Manga>,DAOFields{
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:weeb.db";
    /**
     * Construtor da classe modelo de MangaDAO<br>
     *     Inicia a conexao com SQL
     */
    public MangaDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Classe de retorno de lista
     * @return Lista de manga
     */
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

    /**
     * Classe que ira adicionar um novo manga no banco de dados
     * @param manga O manga para ser adicionado no banco de dados
     */
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
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Metodo que ira verificar a existencia de um manga na tabela no banco de dados
     * @param novoNome Nome do novo manga
     * @return true se ja existir manga no banco, false se nao existir
     */
    @Override
    public boolean isinDB(String novoNome) {
        List<Manga> mangas = getAll();
        for(Manga manga: mangas){
            if(manga.getNome().equals(novoNome)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return Nome da tabela (manga)
     */
    @Override
    public String getTableName() {
        return "manga";
    }

    /**
     *
     * @param table Nome da tabela
     * @return Frase usada em SQL para adicionar um novo elemento na tabela
     */
    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+table +" (url,nome,sinopse,quantCap,quantVol,tipo,nota) VALUES (?,?,?,?,?,?,?);";
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
