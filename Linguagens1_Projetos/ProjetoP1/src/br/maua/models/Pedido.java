package br.maua.models;

import java.util.Random;

import br.maua.enums.EstadoPedido;
import br.maua.enums.MetodoPagamento;

public class Pedido {
    String idPedido;
    String descricao;
    double valor;
    EstadoPedido estado;
    MetodoPagamento mPagamento;


    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++) {
            idGerado+=random.nextInt(10);
        }
        return idGerado;
    }
}