import java.util.ArrayList;
import java.util.Random;
/**
 * Grupo Kali
 * André Lebrão Aigner Ribeiro - 18.00356-7
 * João Guilherme Martins Jatobá - 18.01790-8
 * João Pedro de Padua Santoro Azevedo - 18.02227-4
 */
/**
 * Client
 */
public class Client {

    private String name;
    private static Account conta;
    public static ArrayList<Client> arrayClients = new ArrayList<>();

    public void execute(double valor) {
        int aleatorio = getRandomNumberInRange(0, 1);
        if (aleatorio == 1) {
            Client.conta.deposit(valor);
            System.out.println("deposit");
        } else {
            Client.conta.withdraw(valor);
            System.out.println("withdraw");
        }
    }


    //Essa função foi fornecida como material para uma Atividade de Linguagens de Programação 1
    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public Client(String name) {
        this.name = name;
        arrayClients.add(this);
    }
    public void getCliente(){
        System.out.printf("\nNome: %s\tBalance: %.2f\n",this.name, Client.conta.getBalance());
    }

    public static void getClients(){
        for (Client each : arrayClients) {
            each.getCliente();
        }
    }
    public String getName(){
        return name;
    }
    public static void setAccount(Account account){
        Client.conta = account;
    }
}