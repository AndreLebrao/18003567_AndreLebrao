package br.maua.interfaces;

import br.maua.enums.SystemTime;
/**
 * @author André Lebrão A Ribeiro 18.00356-7 - andledrao@gmail.com
 * @author João Guilherme Martins Jatobá 18.01790-8 - jguilhermejatoba@hotmail.com
 * @since 08/06/2000
 * @version 1.0
 * 
 * Interface utilizada para criação do método
 * onde serão impressas as mensagens individuais
 * de cada cargo.
 */
public interface MemberPostarMensagem {
    public void postarMensagem(String mensagem, SystemTime time);
}