package br.maua.models;

import br.maua.enums.MemberType;


public class BigBrother extends Member {
    public BigBrother(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.BIG_BROTHER;
        this.assRegular = "Sempre ajudando as pessoas membros ou não S2!";
        this.assExtra = "...";
    }


}