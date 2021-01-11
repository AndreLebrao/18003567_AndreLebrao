package br.maua.dao;

import java.util.List;

/**
 * Interface com funcoes de SQL e comparacao de elementos ja existentes
 * @param <T> Tipo de objeto usado pela interface
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */
public interface DAO <T>{
    List<T> getAll();
    void create(T t);
    boolean isinDB(String nome);
}
