package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;
import br.maua.interfaces.MemberPostarMensagem;

public class MobileMember extends Member implements MemberPostarMensagem {

    public MobileMember(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.MOBILE_MEMBER;
        this.assRegular = "Happy Coding!";
        this.assExtra = "Happy_C0d1ng.Maskers";}

    @Override
    public void postarMensagem (String mensagem) {
        if (this.sTime.equals(SystemTime.REGULAR)) {
            System.out.printf(this.assRegular);   
        } else {
            System.out.printf(this.assExtra);
        }
    }
}