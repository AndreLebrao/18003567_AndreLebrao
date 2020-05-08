import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);

        int valores[] = {10,20,50,100};

        Account a1 = new Account(200);
        Client c1 = new Client("Furlan");
        Client c2 = new Client("Murilo");
        Client c3 = new Client("Vanderlei");
        Client c4 = new Client("Aparecido");
        Client.setAccount(a1);

        boolean flag = true;
        
        Client.getClients();
        int valor = valores[Client.getRandomNumberInRange(0, 3)];
        valor = valores[Client.getRandomNumberInRange(0, 3)];

    }
}