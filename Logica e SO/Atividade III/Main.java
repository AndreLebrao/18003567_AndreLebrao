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
        
        Client.getClients();

        while (flag) {
            System.out.println("Escolha a operação:\n1 - todas aleatórias\n2 - uma aleatória\n0 - exit");
            int resp = scanner.nextInt();
            scanner.nextLine();

            int valor = valores[Client.getRandomNumberInRange(0, 3)];
            
            switch (resp) {
                case 1:
                for (Client each : Client.arrayClients) {
                    each.execute(valor);
                    valor = valores[Client.getRandomNumberInRange(0, 3)];
                }
                    break;
                case 2:
                    System.out.println("Qual conta deseja depositar?(digite o nome): ");
                    String nome = scanner.nextLine();
                    for (Client each : Client.arrayClients) {
                        if ((each.getName()).equalsIgnoreCase(nome)) {
                            each.execute(valor);
                            break;
                        }else{
                            System.out.println("Nome não encontrado...");
                        }
                    }
                    break;
                default:
                    break;
            }
            Client.getClients();
        }
    }
}