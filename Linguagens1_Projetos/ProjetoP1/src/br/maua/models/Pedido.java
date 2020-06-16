package br.maua.models;

import java.util.Random;
import java.util.Scanner;

import br.maua.enums.EstadoPedido;
import br.maua.enums.MetodoPagamento;
import br.maua.interfaces.LerNumero;

public class Pedido {
    private String idPedido;
    private String descricao;
    private double valor;
    private EstadoPedido estado;
    private MetodoPagamento mPagamento;


    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++) {
            idGerado+=random.nextInt(10);
        }
        return idGerado;
    }

    public Pedido(String descricao, double valor, MetodoPagamento mPagamento) {
        this.idPedido = geradorId();
        this.descricao = descricao;
        this.valor = valor;
        this.estado = EstadoPedido.REALIZADO;
        this.mPagamento = mPagamento;

    }

    public String getIdPedido() {
        return idPedido;
    }

    @Override
    public String toString() {
        return "Pedido [descricao=" + descricao + ", estado=" + estado + ", mPagamento=" + mPagamento + ", valor="
                + valor + "]";
    }

    public void setEstadoPedido(){
        Scanner eScanner = new Scanner(System.in);
        System.out.println("Estado do pedido:\n1 - Realizado\n2 - Preparacao\n3 - Saiu para entrega\n4 - Entregue\n5 - Devolvido\n");
        int intEstadoPedido = LerNumero.lerInt(eScanner.nextLine());
        switch (intEstadoPedido) {
            case 1:
                this.estado = EstadoPedido.REALIZADO;
                break;
            case 2:
                this.estado = EstadoPedido.PREPARACAO;
                break;
            case 3:
                this.estado = EstadoPedido.SAIU_PARA_ENTREGA;
                break;
            case 4:
                this.estado = EstadoPedido.ENTREGUE;
                break;
            case 5:
                this.estado = EstadoPedido.DEVOLVIDO;
                break;
            default:
                break;
        }
    }
}