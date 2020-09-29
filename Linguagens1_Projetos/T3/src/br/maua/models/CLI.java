package br.maua.models;

import java.util.Scanner;

public class CLI {
    private static boolean flag=true;

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome;
        while(flag){
            System.out.println("1 - Anime\n2 - Manga\n0 - sair\nEscolha a opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Nome do anime: ");
                    nome = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Nome do manga: ");
                    nome = scanner.nextLine();
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
