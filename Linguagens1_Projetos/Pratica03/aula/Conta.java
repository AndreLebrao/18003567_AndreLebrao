
/**
 * Conta
 */
public class Conta {

    private double saldo;
    private double limite;

    void sacar(double valor){

        if(valor<=saldo)
        saldo-=valor;
    }
    void depositar(double valor){
        this.saldo+=valor;
    }
    public double consultaSaldo(){
        return this.saldo+this.limite;
    }

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;

    }
}