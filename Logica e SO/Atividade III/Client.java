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
public class Client extends Thread{
    public Account account;
    private String name;

    public Client(String name,Account buffer) {
		super(name);
        this.account = buffer;
	}
	@Override
	public void run() {
        int valores[] = {10,20,50,100};
        int valor = valores[Client.getRandomNumberInRange(0, 3)];
        String acao;
		try {
			while (true) {
                acao = execute();
                if (acao.equals("deposit")) {
                    account.deposit(valor);
                    Thread.yield();
                } else {
                    account.withdraw(valor);
                    Thread.yield();
                }
                valor = valores[Client.getRandomNumberInRange(0, 3)];
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    public String execute(){
        int aleatorio = getRandomNumberInRange(0, 1);
        if (aleatorio == 1) {
            return "deposit";
        } else {
            return "withdraw";
        }
    }
    //Essa função foi fornecida como material para uma Atividade de Linguagens de Programação 1
    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


}