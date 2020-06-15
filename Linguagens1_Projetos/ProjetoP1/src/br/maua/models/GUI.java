package br.maua.models;

import java.util.ArrayList;
import java.util.Scanner;

import br.maua.enums.MetodoPagamento;
import br.maua.interfaces.LerNumero;

public class GUI implements LerNumero{
    private static ArrayList<Pedido> listaPedidos = new ArrayList<>();
    
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int resposta;
        System.out.println("\nPizzaria o Rato que Ri:\n1 - Nova venda\n2 - Verificar pedidos\n3 - Alterar pedidos\n0 - Sair\n");
        resposta = LerNumero.lerInt(scanner.nextLine());
        while (resposta!=0) {
            switch (resposta) {
                case 1:
                    System.out.println("Descricao do pedido: ");
                    String descricao = scanner.nextLine();
                    System.out.println("Preco do pedido: ");
                    double preco = LerNumero.lerDouble(scanner.nextLine());
                    if(preco <= 0){
                        System.out.println("Preco invalido...");
                        break;
                    }
                    System.out.println("Método de pagamento:\n1 - Dinheiro\n2 - Debito\n3 - Credito\n4 - Vale Alimentacao\n5 - VR\n");
                    MetodoPagamento mPagamento = MetodoPagamento.DINHEIRO;
                    int intMetodoPagamento = LerNumero.lerInt(scanner.nextLine());
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
                    listaPedidos.add(new Pedido(descricao, preco, mPagamento));
                    break;
                case 2:
                    System.out.println("verificar pedidos");
                    break;
                case 3:
                    System.out.println("mudar pedido");
                    break;
            
                default:
                    System.out.println("Digite uma opcao valida...\n");
                    break;
            }
            System.out.println("Pizzaria o Rato que Ri:\n1 - Nova venda\n2 - Verificar pedidos\n3 - Alterar pedidos\n0 - Sair\n\n");
            resposta = LerNumero.lerInt(scanner.nextLine());
        }
    }

}