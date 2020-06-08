package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;
import br.maua.interfaces.MemberPostarMensagem;

public class HeavyLifter extends Member implements MemberPostarMensagem{
    
    public HeavyLifter(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.HEAVY_LIFTER;
        this.assRegular = "Podem contar conosco!";
        this.assExtra = "N00b_qu3_n_Se_r3pita.bat";
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