package br.maua.models;

import br.maua.enums.MemberType;


public class MobileMember extends Member{

    public MobileMember(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.MOBILE_MEMBER;
        this.assRegular = "Happy Coding!";
        this.assExtra = "Happy_C0d1ng.Maskers";
    }
    
}