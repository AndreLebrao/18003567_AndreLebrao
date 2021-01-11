/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Personagem p1 = new Personagem("voltorb");
        Personagem p2 = new Personagem("raichu");

        System.out.println("URL 1: "+p1.getUrl());
        System.out.println("URL 2: "+p2.getUrl());
    }
}