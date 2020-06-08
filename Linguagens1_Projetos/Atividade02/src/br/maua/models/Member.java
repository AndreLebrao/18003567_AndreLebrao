package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;
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
        System.out.printf("\nNome: %s\nEmail: %s\nCargo: %s\n",this.getNomeUsuario(),this.getEmail(),this.getCargo());
    }

        /** 
     * @param mensagem
     */
    @Override
    public void postarMensagem(String mensagem, SystemTime time) {
        if (time.equals(SystemTime.REGULAR)) {
            System.out.printf("\n%s %s - %s\n",this.getNomeUsuario(),mensagem,this.assRegular);   
        } else {
            System.out.printf("\n%s %s - %s\n",this.getNomeUsuario(),mensagem,this.assExtra);
        }
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

}