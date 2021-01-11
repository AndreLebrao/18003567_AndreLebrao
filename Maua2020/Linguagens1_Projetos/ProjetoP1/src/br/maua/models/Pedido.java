package br.maua.models;

import java.util.Random;
import java.util.Scanner;

import br.maua.enums.EstadoPedido;
import br.maua.enums.MetodoPagamento;
import br.maua.interfaces.LerNumero;

/**
 * Classe que modela um Pedido da Pizzaria
 */
public class Pedido {
    private String idPedido;
    private String descricao;
    private double valor;
    private EstadoPedido estado;
    private MetodoPagamento mPagamento;


    
    /** 
     * @return sequencia de numeros inteiros aleatorios seguidos, mas como uma String
     */
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

    
    /** 
     * @return atributo String idPedido;
     */
    public String getIdPedido() {
        return idPedido;
    }

    
    /** 
     * @return String os seguintes atributos de um pedido: descricao, estado, mPagamento e valor
     */
    @Override
    public String toString() {
        return "Pedido [descricao=" + descricao + ", estado=" + estado + ", mPagamento=" + mPagamento + ", valor="
                + valor + "]";
    }

    /**
     * Permite ao usuário mudar o atributo EstadoPedido estado desse objeto Pedido digitando um valor int correspondente a um dos estados:
     * 1 - REALIZADO
     * 2 - PREPARACAO
     * 3 -SAIU PARA ENTREGA
     * 4 - ENTREGUE
     * 5 - DEVOLVIDO
     * @see EstadoPedido
     */
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
    /**
     * @return MetodoPagamento mPagamento
     * Diferentemente de setEstadoPedido, essa funcao devolve uma variavel para ser usada na criação de objetos Pedido. Caso nenhum método de pagamento válido seja escolhido, irá retornar o método de pagamento padrão.
     * 
     * O método de pagamento padrão é DINHEIRO
     * @see MetodoPagamento
     */
    public static MetodoPagamento setMPagamento(){
        Scanner mScanner = new Scanner(System.in);
        System.out.println("Método de pagamento:\n1 - Dinheiro\n2 - Debito\n3 - Credito\n4 - Vale Alimentacao\n5 - VR\n");
        MetodoPagamento mPagamento = MetodoPagamento.DINHEIRO;
        int intMetodoPagamento = LerNumero.lerInt(mScanner.nextLine());
        switch (intMetodoPagamento) {
            case 1:
                mPagamento = MetodoPagamento.DINHEIRO;
                break;
            case 2:
                mPagamento = MetodoPagamento.DEBITO;
                break;
            case 3:
                mPagamento = MetodoPagamento.CREDITO;
                break;
            case 4:
                mPagamento = MetodoPagamento.VALE_ALIMENTACAO;
                break;
            case 5:
                mPagamento = MetodoPagamento.VALE_REFEICAO;
                break;
            default:
                break;
        }
        return mPagamento;
    }
}