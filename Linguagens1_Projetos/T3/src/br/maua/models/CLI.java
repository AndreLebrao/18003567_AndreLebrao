package br.maua.models;

import java.util.Scanner;

public class CLI {
    private static boolean flag=true;

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        while(flag){
            System.out.println("1 - Anime\n2 - Manga\n0 - sair\nEscolha a opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("anime");
                    break;
                case 2:
                    System.out.println("manga");
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    break;
            }
        }
    }
}
