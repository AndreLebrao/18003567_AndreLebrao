package br.maua.models;
/**
 * Classe abstrata para modelar qualquer outro Funcionário da Pizzaria
 */
public abstract class Funcionario {
    String nome;
    String senha;
    String email;

    public Funcionario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    
    /** 
     * @return atributo String nome do objeto
     */
    public String getNome() {
        return nome;
    }
}