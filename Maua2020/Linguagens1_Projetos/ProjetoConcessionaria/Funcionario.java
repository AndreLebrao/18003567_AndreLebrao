/**
 * 
 * Funcionario
 */
public class Funcionario {
    protected double salarioBase;
    protected double comissao;
    private double vendasMes;
    private static int quantFuncionarios;
    protected double bonusMensal = RH.getTotalDeVendas()/quantFuncionarios;


    public double getSalarioBase() {
        return salarioBase;
    }


    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao * totalVendasMes;
    }

    //Construtor
    public Funcionario(double salarioBase){
        quantFuncionarios+=1;
        this.salarioBase = salarioBase;
        this.comissao = 0.05;
    }
    public Funcionario(double salarioBase, double comissao) {
        quantFuncionarios+=1;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }
    public Funcionario(double salarioBase, double comissao,double vendasMes) {
        quantFuncionarios+=1;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.vendasMes = vendasMes;
    }
}