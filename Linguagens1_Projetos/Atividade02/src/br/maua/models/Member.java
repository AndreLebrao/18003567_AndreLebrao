package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.interfaces.MemberApresentacao;
import br.maua.interfaces.MemberPostarMensagem;

/**
 * @author André Lebrão A Ribeiro 18.00356-7 - andledrao@gmail.com
 * @author João Guilherme Martins Jatobá 18.01790-8 - jguilhermejatoba@hotmail.com
 * @since 08/06/2000
 * @version 1.0
 */
/**
 * Classe mãe dos trabalhadores da organização MAsK_S0c13ty
 *  Assina a implementação das interfaces MemberApresentacao e MemberPostarMensagem
 * 
 */
public abstract class Member implements MemberApresentacao,MemberPostarMensagem{
    
    private String nomeUsuario;
    private String email;
    protected String assRegular;
    protected String assExtra;

    
    protected MemberType cargo;
    /**
     * As assinaturas são diferentes dependendo do cargo
     * da pessoa
     */
    public Member(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }
    
    @Override
    public void apresentar() {
        
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
    

    /**
     *  Retorna o cargo do membro
     * 
     */
    public MemberType getCargo() {
        return cargo;
        
    }

    /**
     * retorna o email do membro
     */
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