package br.maua.models;

import java.util.Scanner;
import br.maua.models.*;
import br.maua.enums.Tipo;
import br.maua.parsers.AnimeParser;
import br.maua.parsers.MangaParser;

public class CLI {
    private static boolean flag=true;

    public static void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome;
        while(flag){
            System.out.printf("1 - Anime\n2 - Manga\n3 - Mostrar banco de dados\n0 - sair\nEscolha a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                //TODO: antes de pesquisar na API tem que pesquisar no banco de dados, se ja tiver ja fala que tem no
                // banco
                case 1:
                    System.out.println("Nome do anime: ");
                    nome = scanner.nextLine();
                    Anime anime = AnimeParser.fromJSON(JikanAPI.getFirstSearchResult(Tipo.ANIME,nome));
                    System.out.println(anime);
                    break;
                case 2:
                    System.out.println("Nome do manga: ");
                    nome = scanner.nextLine();
                    Manga manga = MangaParser.fromJSON(JikanAPI.getFirstSearchResult(Tipo.MANGA,nome));
                    System.out.println(manga);
                    break;
                case 3:
                    System.out.println("Qual banco de dados?\n1 - Anime\n2 - Manga\nEscolha a opção: ");
                    int opcaoBanco = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoBanco){
                        case 1:
                            System.out.println("banco anime");
                            break;
                        case 2:
                            System.out.println("banco manga");
                            break;
                        default:
                            break;
                    }
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
