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
    void sacar(){}
    void depositar(){}
    void visualizarSaldo(){
            System.out.println("Saldo: "+ this.saldo);
    }
    void transferirDinheiro(){}


}