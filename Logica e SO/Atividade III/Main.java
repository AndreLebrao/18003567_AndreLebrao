
/**
 * Grupo Kali
 * André Lebrão Aigner Ribeiro - 18.00356-7
 * João Guilherme Martins Jatobá - 18.01790-8
 * João Pedro de Padua Santoro Azevedo - 18.02227-4
 */
/**
 * Main
 */
public class Main{

    public static void main(String[] args) {

        Account account = new Account();
        Client c1 = new Client("Furlan",account);
        Client c2 = new Client("Murilo",account);
        Client c3 = new Client("Vanderlei",account);
        Client c4 = new Client("Aparecido",account);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}