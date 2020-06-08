package br.maua.models;

import br.maua.enums.MemberType;
import br.maua.enums.SystemTime;

/**
 * @author André Lebrão A Ribeiro 18.00356-7 - andledrao@gmail.com
 * @author João Guilherme Martins Jatobá 18.01790-8 - jguilhermejatoba@hotmail.com
 * @since 08/06/2000
 * @version 1.0
 * 
 * Classe filha de Member, para quem é do cargo de 
 * Big Brother.
 */
public class BigBrother extends Member {
    public BigBrother(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        this.cargo = MemberType.BIG_BROTHER;
        this.assRegular = "Sempre ajudando as pessoas membros ou não S2!";
        this.assExtra = "...";
    }

    
    
    /** 
     * @param mensagem
     * Imprime a assinatura do cargo dependendo da 
     * hora do trabalho.
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