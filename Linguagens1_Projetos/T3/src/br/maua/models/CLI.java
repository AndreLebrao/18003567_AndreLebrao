package br.maua.models;

import java.util.List;
import java.util.Scanner;
import br.maua.dao.AnimeDAO;
import br.maua.dao.MangaDAO;
import br.maua.enums.Tipo;
import br.maua.parsers.AnimeParser;
import br.maua.parsers.MangaParser;

/**
 * Responsavel pela interface com o usuario
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 28/09/2020
 */
public class CLI {

    private static boolean flag=true;
    /**
     *
     * @param animes Lista de animes existentes no banco de dados
     */
    public static void printAnimeList(List<Anime> animes){
        for (Anime anime:animes) {
            System.out.println(anime);
            System.out.println();
        }
    }

    /**
     *
     * @param mangas Lista de mangas existentes no banco de dados
     */
    public static void printMangaList(List<Manga> mangas){
        for(Manga manga : mangas){
            System.out.println(manga);
            System.out.println();
        }
    }

    /**
     * Classe que sera a implementacao da interface que o usuario vera
     * @throws Exception
     */
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
                case 1:
                    System.out.println("Nome do anime: ");
                    nome = scanner.nextLine();
                    if(animeDAO.isinDB(nome)){
                        System.out.println("Esse anime já está no DB...");
                        break;
                    }
                    try {
                        Anime anime = AnimeParser.fromJSON(JikanAPI.getFirstSearchResult(Tipo.ANIME, nome));
                        animeDAO.create(anime);
                    }catch (Exception e){
                        System.out.println("Erro ao adicionar o anime...");
                    }
                    break;
                case 2:
                    System.out.println("Nome do manga: ");
                    nome = scanner.nextLine();
                    if(mangaDAO.isinDB(nome)){
                        System.out.println("Esse manga já está no DB...");
                        break;
                    }
                    try {
                        Manga manga = MangaParser.fromJSON(JikanAPI.getFirstSearchResult(Tipo.MANGA, nome));
                        mangaDAO.create(manga);
                    }catch (Exception e){
                        System.out.println("Erro ao cadastrar o manga...");
                    }
                    break;
                case 3:
                    System.out.println("Qual banco de dados?\n1 - Anime\n2 - Manga\nEscolha a opção: ");
                    int opcaoBanco = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoBanco){
                        case 1:
                            printAnimeList(animeDAO.getAll());
                            break;
                        case 2:
                            printMangaList(mangaDAO.getAll());
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
