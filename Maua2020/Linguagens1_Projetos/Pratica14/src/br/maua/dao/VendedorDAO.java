package br.maua.dao;

import br.maua.models.Produto;

import java.sql.Connection;
import java.util.List;

public class VendedorDAO implements DAO<Produto>,DAOFields{
    private Connection connection;
    //    private String myDBConnectionString = "jdbc:sqlite:dados.db";
    private String myDBConnectionString = "jdbc:sqlite:dados_tuned.db";
    @Override
    public List<Produto> get(String codition) {
        return null;
    }

    @Override
    public List<Produto> getAll() {
        return null;
    }

    @Override
    public void update(Produto produto) {

    }

    @Override
    public void create(Produto produto) {

    }

    @Override
    public void delete(Produto produto) {

    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public String getDeleteString(String table) {
        return null;
    }

    @Override
    public String getUpdateString(String table) {
        return null;
    }

    @Override
    public String getInsertString(String table) {
        return null;
    }

    @Override
    public String getSelectAllString(String table) {
        return null;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return null;
    }
}
