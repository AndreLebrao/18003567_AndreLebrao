package br.maua.models;

import java.util.Scanner;

import br.maua.interfaces.Autenticacao;

public class Usuario extends Funcionario implements Autenticacao{

    public Usuario(String nome, String senha, String email) {
        super(nome, senha, email);
    }

    @Override
    public boolean autentication() {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("Senha: ");
        String senha = aScanner.nextLine();
        if (this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
        
    }
    
}