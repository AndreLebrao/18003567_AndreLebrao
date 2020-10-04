package br.maua.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.maua.dao.AnimeDAO;
import br.maua.dao.MangaDAO;
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
        AnimeDAO animeDAO = new AnimeDAO();
        MangaDAO mangaDAO = new MangaDAO();
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
                    if(animeDAO.isinDB(nome)){
                        System.out.println("Esse anime já está no DB");
                        break;
                    }
                    Anime anime = AnimeParser.fromJSON(JikanAPI.getFirstSearchResult(Tipo.ANIME,nome));
                    animeDAO.create(anime);
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
                            System.out.println(animeDAO.getAll());
                            break;
                        case 2:
                            System.out.println(mangaDAO.getAll());
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
