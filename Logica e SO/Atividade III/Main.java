import java.util.Scanner;

/**
 * Main
 */
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valores[] = {10,20,50,100};

        Account a1 = new Account(200);
        Account a2 = new Account(100);
        Client c1 = new Client("Furlan", a1);
        Client c2 = new Client("Murilo", a2);

        boolean flag = true;

        while (flag) {
            System.out.println("Escolha a operação:\n1 - random\n2 - deposit\n3 - withdraw\n0 - exit");
            int resp = scanner.nextInt();
            scanner.nextLine();
            int valor = valores[Client.getRandomNumberInRange(0, 3)];
            switch (resp) {
                case 1:
                    System.out.println("Cliente 1: ");
                    System.out.println(c1.execute());

                    break;
                case 2:
                    System.out.println("Qual o valor que deseja depositar?");
                    break;
            
                default:
                    break;
            }
        }
    }
}