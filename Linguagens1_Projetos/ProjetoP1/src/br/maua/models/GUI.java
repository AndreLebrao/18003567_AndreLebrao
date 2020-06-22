package br.maua.models;

import java.util.ArrayList;
import java.util.Scanner;

import br.maua.enums.MetodoPagamento;
import br.maua.interfaces.LerNumero;

public class GUI implements LerNumero{
    private static ArrayList<Pedido> listaPedidos = new ArrayList<>();
    
    
    /** 
     * @param user
     * 
     */
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
                        MetodoPagamento mPagamento = Pedido.setMPagamento();
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
                    boolean idEncontrado = false;
                    if (user.autentication()) {
                        System.out.println("ID do pedido: ");
                        String ID = scanner.nextLine();
                        for (Pedido pedido : listaPedidos) {
                            if (pedido.getIdPedido().equals(ID)) {
                                pedido.setEstadoPedido();
                                idEncontrado = true;
                                break;
                            }
                        }
                    } else {
                        System.out.println("senha inválida");
                    }
                    if (!idEncontrado) {
                        System.out.println("Id nao encontrado");
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