package br.maua.models;

import br.maua.enums.MemberType;


public class HeavyLifter extends Member{
    
    public HeavyLifter(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.HEAVY_LIFTER;
        this.assRegular = "Podem contar conosco!";
        this.assExtra = "N00b_qu3_n_Se_r3pita.bat";
    }

    
    
}