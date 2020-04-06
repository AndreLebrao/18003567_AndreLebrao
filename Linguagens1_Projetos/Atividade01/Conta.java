/**
 * André Lebrão - 18.00356-7
 * 06/04/2020
 */
public class Conta {
    private int idConta;
    private double saldo;
    private Usuario user;

    public Conta(int idConta, double saldo, Usuario user) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.user = user;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public boolean retirar(double valor){
        if (this.saldo>=valor) {
            this.saldo-=valor;
            return true;
        } else {
            return false;
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

}