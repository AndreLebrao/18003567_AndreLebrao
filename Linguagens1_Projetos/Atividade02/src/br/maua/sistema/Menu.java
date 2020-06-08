package br.maua.sistema;

import java.util.ArrayList;
import java.util.Scanner;

import br.maua.models.Member;

public abstract class Menu {

    private static ArrayList<Member> memberList;

    public static void run(){
        boolean flag = true;
        int option;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Escolha uma opção: \n1 - Cadastrar\n2 - Remover\n3 - Postar Mensagem\n4 - Apresentar\n5 - Trocar Hora de Trabalho\n0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("cadastro");
                    break;
                
                case 2:
                    System.out.println("remover");
                    break;
                case 3:
                    System.out.println("postar msg");
                    break;

                case 4:
                    System.out.println("apresentar");
                    break;
                
                case 5:
                    System.out.println("trocar hora");
                    break;
                default:
                    break;
            }
            System.out.println("\n\n");
        }

    }
}