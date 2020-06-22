package br.maua.models;

import java.util.Scanner;

import br.maua.interfaces.Autenticacao;
/**
 * Subclasse de Funcionario, assina a interface Autenticacao
 * É necessária para utilizar a interface gráfica da Pizzaria
 * @see Funcionario
 * @see Autenticacao
 * @see GUI
 */
public class Usuario extends Funcionario implements Autenticacao{

    public Usuario(String nome, String senha, String email) {
        super(nome, senha, email);
    }

    
    /** 
     * @return boolean
     * Permite ao usuário digitar uma senha que será comparada com o atributo String senha do objeto Usuario atual
     */
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