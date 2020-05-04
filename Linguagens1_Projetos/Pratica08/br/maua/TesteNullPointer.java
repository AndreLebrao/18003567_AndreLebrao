package br.maua;

public class TesteNullPointer {
    public static void main(String[] args) {
        String frase = "Assistam Eternal Monarch!!";
        String novaFrase = frase.toUpperCase();
        System.out.println("Frase Original:" + frase);
        System.out.println("Frase Modificada:" + novaFrase);
    }
}