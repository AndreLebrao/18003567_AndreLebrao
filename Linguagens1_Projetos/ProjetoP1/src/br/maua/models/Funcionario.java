package br.maua.models;

public abstract class Funcionario {
    String nome;
    String senha;
    String email;

    public Funcionario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}