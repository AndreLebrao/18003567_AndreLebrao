package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;

public class MobileMember extends Member{

    public MobileMember(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.MOBILE_MEMBER;
        this.assRegular = "Happy Coding!";
        this.assExtra = "Happy_C0d1ng.Maskers";
    }
    
    /** 
     * @param mensagem
     */
    @Override
    public void postarMensagem (String mensagem, SystemTime time){
        if (time.equals(SystemTime.REGULAR)) {
            System.out.printf(this.assRegular);   
        } else {
            System.out.printf(this.assExtra);
        }
    }
}