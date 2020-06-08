package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.interfaces.MemberApresentacao;
import br.maua.interfaces.MemberPostarMensagem;

public abstract class Member implements MemberApresentacao,MemberPostarMensagem{
    
    private String nomeUsuario;
    private String email;
    protected String assRegular;
    protected String assExtra;
    protected MemberType cargo;

    public Member(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }
    
    @Override
    public void apresentar() {
        // TODO Auto-generated method stub
        System.out.println("Nome: "+ this.getNomeUsuario()
        +"\nE-mail: " + this.getEmail()
        +"\nCargo: "+ this.getCargo());
    }

    
    /** 
     * @return String
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public MemberType getCargo() {
        return cargo;
    }


    public String getEmail() {
        return email;
    }


    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Member [email=" + email + ", nomeUsuario=" + nomeUsuario + "]";
    }
}