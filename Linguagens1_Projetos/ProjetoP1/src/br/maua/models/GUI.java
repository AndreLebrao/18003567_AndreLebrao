package br.maua.models;

import java.util.ArrayList;
import java.util.Scanner;

import br.maua.enums.MetodoPagamento;
import br.maua.interfaces.LerNumero;

public class GUI implements LerNumero{
    private static ArrayList<Pedido> listaPedidos = new ArrayList<>();
    
    public static void run(Usuario user){
        Scanner scanner = new Scanner(System.in);
        int resposta;
        System.out.println("\nPizzaria o Rato que Ri:\n1 - Nova venda\n2 - Verificar pedidos\n3 - Alterar pedidos\n0 - Sair\n");
        resposta = LerNumero.lerInt(scanner.nextLine());
        while (resposta!=0) {
            switch (resposta) {
                case 1:
                    if (user.autentication()) {
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
                        }
                    else
                        System.out.println("Senha invalida");
                    break;
                case 2:
                    for (Pedido pedido : listaPedidos) {
                        System.out.printf("ID: %s - %s\n",pedido.getIdPedido(),pedido.toString());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("ID do pedido: ");
                    String ID = scanner.nextLine();
                    System.out.println("Escolha o que alterar:\n1 - Descricao\n2 - Estado\n3 - Modo de Pagamento\n4 - Valor\n");
                    int opcaoPedido = LerNumero.lerInt(scanner.nextLine());
                    switch (opcaoPedido) {
                        case 1:
                            for (Pedido pedido : listaPedidos) {
                                if (pedido.getIdPedido().equals(ID)) {
                                //TODO: eu crio métodos pra alterar esses valores? eles são todos privados, não faz mto sentido eles terem setters se a validação de senha só ocorre aqui na GUI e não na hora de usar os métodos
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            for (Pedido pedido : listaPedidos) {
                                if (pedido.getIdPedido().equals(ID)) {
                                    
                                } else {
                                    break;
                                }
                            }
                        case 3:
                            for (Pedido pedido : listaPedidos) {
                                if (pedido.getIdPedido().equals(ID)) {
                                    
                                } else {
                                    break;
                                }
                            }
                        case 4:
                            for (Pedido pedido : listaPedidos) {
                                if (pedido.getIdPedido().equals(ID)) {
                                    
                                } else {
                                    break;
                                }
                            }
                            break;
                    
                        default:
                            break;
                    }
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