package br.maua.models;

import java.util.ArrayList;

import br.maua.enums.MemberType;
import br.maua.interfaces.MemberApresentacao;

public abstract class Member implements MemberApresentacao{
    
    private String nomeUsuario;
    private String email;
    protected String assRegular;
    protected String assExtra;
    protected MemberType cargo;

    public Member(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }
    
    /** 
     * @param list
     */
    @Override
    public void apresentar(ArrayList<Member> list) {
        // TODO Auto-generated method stub
        
    }

    
    /** 
     * @return String
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Member [email=" + email + ", nomeUsuario=" + nomeUsuario + "]";
    }
}