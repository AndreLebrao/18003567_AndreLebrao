package br.maua.interfaces;

import br.maua.enums.SystemTime;

public interface MemberPostarMensagem {
    public void postarMensagem(String mensagem, SystemTime time);
}