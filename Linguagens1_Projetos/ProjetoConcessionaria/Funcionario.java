/**
 * Funcionario
 */
public class Funcionario {

    private double salarioBase;
    private double comissao;
    private Gerente gerente;
    
    //Construtor
    public Funcionario(double salarioBase){
        this.salarioBase = salarioBase;
        this.gerente = gerente; 
        this.comissao = 0.05;
    }

    /**
     * @return the comissao
     */
    public double getComissao() {
        return comissao;
    }
    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao*totalVendasMes;
    }
}