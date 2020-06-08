package br.maua.models;

import java.util.ArrayList;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;
import br.maua.interfaces.MemberApresentacao;

public abstract class Member implements MemberApresentacao{
    
    private String nomeUsuario;
    private String email;
    protected String assRegular;
    protected String assExtra;
    protected MemberType cargo;
    protected SystemTime sTime;

    public Member(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        sTime = SystemTime.REGULAR;
    }

    public void trocarSystemTime(){
        if (sTime.equals(SystemTime.REGULAR)) {
            sTime = SystemTime.EXTRA;
        } else {
            sTime = SystemTime.REGULAR;
        }
    }

    @Override
    public void apresentar(ArrayList<Member> list) {
        // TODO Auto-generated method stub
        
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    @Override
    public String toString() {
        return "Member [email=" + email + ", nomeUsuario=" + nomeUsuario + "]";
    }
}