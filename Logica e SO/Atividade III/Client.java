import java.util.ArrayList;
import java.util.Random;

/**
 * Client
 */
public class Client {

    private String name;
    private Account conta;
    private static ArrayList<Client> Clients = new ArrayList<>();

    public String execute() {
        int aleatorio = getRandomNumberInRange(0, 1);
        if (aleatorio == 1) {
            return "deposit";
        } else {
            return "withdraw";
        }
    }

    public void getCliente(){
        System.out.printf("\nNome: %s\tBalance: %.2f\n",this.name,this.conta.getBalance());
    }
    //Essa função foi fornecida como material para uma Atividade de Linguagens de Programação 1
    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public Client(String name, Account conta) {
        this.name = name;
        this.conta = conta;
        Clients.add(this);
    }

}