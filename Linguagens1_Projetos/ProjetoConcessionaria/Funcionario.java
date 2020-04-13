/**
 * 
 * Funcionario
 */
public class Funcionario {
    protected double salarioBase;
    protected double comissao;

    //Construtor
    public Funcionario(double salarioBase){
        this.salarioBase = salarioBase;
        this.comissao = 0.05;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao * totalVendasMes;
    }

    public Funcionario(double salarioBase, double comissao) {
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }
}