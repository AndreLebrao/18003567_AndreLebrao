package Exemplo01;

/**
 * ContaTestDrive
 */
public class ContaTestDrive {

    public static void main(String[] args) {
        //Declara C1, ainda sem nada dentro
        Conta c1; 
        //Instancia conta - coloca a referencia de um objeto
        c1 = new Conta();
        c1.cliente = new Cliente();
        c1.cliente.nome = "Odair";
        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.cliente.nome = "Goku";
        System.out.println("Titular: "+c1.cliente.nome);
        System.out.println("Titular c2: "+c2.cliente.nome);
        c1.saldo = 2000;
        c1.visualizarSaldo();
        //Todo atributo que não tem um valor atribuido tem um default, por nesse caso (double) comeca como 0.0
        // c2.visualizarSaldo();
        c1.sacar(300);
        c1.sacar(3000);
        c1.visualizarSaldo();
        c1.transferirDinheiro(c2, 1000);
        System.out.println("C1: ");
        c1.visualizarSaldo();
        System.out.println("C2: ");
        c2.visualizarSaldo();
    }
}