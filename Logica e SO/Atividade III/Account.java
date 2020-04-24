/**
 * Grupo Kali
 * André Lebrão Aigner Ribeiro - 18.00356-7
 * João Guilherme Martins Jatobá - 18.01790-8
 * João Pedro de Padua Santoro Azevedo - 18.02227-4
 */
/**
 * Account
 */
public class Account {
    private double balance;

    public void deposit(double valor) {
        balance+=valor;
    }
    public boolean withdraw(double valor) {
        if (valor<=balance) {
            balance-=valor;
            return true;
        } else {
            return false;
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public Account(double balance) {
        this.balance = balance;
    }
}