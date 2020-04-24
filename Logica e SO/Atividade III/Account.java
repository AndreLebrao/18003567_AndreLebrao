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