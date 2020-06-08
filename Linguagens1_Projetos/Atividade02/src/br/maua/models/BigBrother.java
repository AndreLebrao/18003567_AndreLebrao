package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;
import br.maua.interfaces.MemberPostarMensagem;

public class BigBrother extends Member implements MemberPostarMensagem{
    public BigBrother(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.BIG_BROTHER;
        this.assRegular = "Sempre ajudando as pessoas membros ou não S2!";
        this.assExtra = "...";
        // TODO Auto-generated constructor stub
    }

    
    @Override
    public void postarMensagem(String mensagem) {
        if (this.sTime.equals(SystemTime.REGULAR)) {
            System.out.printf(this.assRegular);   
        } else {
            System.out.printf(this.assExtra);
        }
    }
}