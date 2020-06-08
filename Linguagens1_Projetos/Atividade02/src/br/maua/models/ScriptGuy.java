package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;
import br.maua.interfaces.MemberPostarMensagem;

public class ScriptGuy extends Member implements MemberPostarMensagem {
    public ScriptGuy(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.SCRIPT_GUY;
        this.assRegular = "Prazer em ajudar novos amigos de código!";
        this.assExtra = "QU3Ro_S3us_r3curs0s.py";
    }

    
    
    /** 
     * @param mensagem 
     */
    @Override
    public void postarMensagem(String mensagem, SystemTime time) {
        if (time.equals(SystemTime.REGULAR)) {
            System.out.printf(this.assRegular);   
        } else {
            System.out.printf(this.assExtra);
        }
    }
}