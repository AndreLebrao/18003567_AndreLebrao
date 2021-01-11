package implementacoes;

import java.util.LinkedList;

public class LinkedListVersion {
    private static void run() {
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("Pallete");
        cidades.add("Viridian");
        cidades.add("Pewter");
        cidades.add("Cerulean");
        cidades.add("Vermilion");
        cidades.add("Celadon");
        cidades.add("Lavander");

        cidades.forEach(cidade -> System.out.println(cidade));

    }
}