package br.maua.models;

import br.maua.enums.MemberType;

public class ScriptGuy extends Member{
    public ScriptGuy(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.SCRIPT_GUY;
        this.assRegular = "Prazer em ajudar novos amigos de código!";
        this.assExtra = "QU3Ro_S3us_r3curs0s.py";
    }

}