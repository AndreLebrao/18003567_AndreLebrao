/**
 * André Lebrão - 18.00356-7
 * 06/04/2020
 */
public class Conta {
    private int idConta;
    private double saldo;
    private Usuario user;
    private static int totalDeContas;

    public Conta(Usuario user,double saldo) {
        Conta.totalDeContas+=1;
        this.idConta = Conta.totalDeContas;
        this.saldo = saldo;
        this.user = user;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public boolean sacar(double valor){
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
    public int getIdConta(){
        return idConta;
    }
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    public String getInfo(){
        return String.format("Nome Usuário: %s - Saldo: %.2f",this.user.getNome(),this.getSaldo());
    }
    public String getUserNome(){
        return user.getNome();
    }
}