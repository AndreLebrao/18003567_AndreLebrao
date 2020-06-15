package br.maua.models;

import java.util.Scanner;

public class GUI {
    public static void run() {
        String rString;
        Scanner scanner = new Scanner(System.in);
        int resposta;

        System.out.println("Pizzaria o Rato que Ri:\n1 - Nova venda\n2 - Verificar pedidos\n3 - Alterar pedidos\n0 - Sair\n\n");
        rString = scanner.nextLine();
        try {
            resposta = Integer.parseInt(rString);
        } catch (Exception e) {
            resposta = 9999;
        }
        while (resposta!=0) {
            switch (resposta) {
                case 1:
                    System.out.println("nova venda");
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
            rString = scanner.nextLine();
            try {
                resposta = Integer.parseInt(rString);
            } catch (Exception e) {
                resposta = 9999;
            }
        }
    }
}