package Exemplo01;

/**
 * Conta
 */

 public class Conta {
    //Atributos
    public int numero;
    public String titular;
    public String cpf;
    public double saldo;
    
    //Métodos da classe
    boolean sacar(double valor){
        if(this.saldo<valor){
            return false;
        }
        else{
            this.saldo-=valor;
            return true;
        }
    }
    void depositar(){}
    void visualizarSaldo(){
            System.out.println("Saldo: "+ this.saldo);
    }
    void transferirDinheiro(){}


}