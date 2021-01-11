package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;

/**
 * @author André Lebrão A Ribeiro 18.00356-7 - andledrao@gmail.com
 * @author João Guilherme Martins Jatobá 18.01790-8 - jguilhermejatoba@hotmail.com
 * @since 08/06/2000
 * @version 1.0
 * 
 * Classe filha de Member para quem é do cargo de
 * Mobile Member.
 */

public class MobileMember extends Member{

    public MobileMember(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.MOBILE_MEMBER;
        this.assRegular = "Happy Coding!";
        this.assExtra = "Happy_C0d1ng.Maskers";
    }
    
    /** 
     * @param mensagem
     * Imprime a assinatura do cargo dependendo da 
     * hora do trabalho.
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