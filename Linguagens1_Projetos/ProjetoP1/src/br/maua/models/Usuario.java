package br.maua.models;

import br.maua.interfaces.Autenticacao;

public class Usuario extends Funcionario implements Autenticacao{

    public Usuario(String nome, String senha, String email) {
        super(nome, senha, email);
    }

    @Override
    public boolean autentication(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
    
}