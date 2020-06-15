package br.maua.models;

public class Usuario {
    String nome;
    String senha;
    String email;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public boolean validarSenha(String senha){
        if (this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}