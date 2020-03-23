/**
 * TesteConta
 */
public class TesteConta {

    public static void main(String[] args) {
        Conta c1 = new Conta(0);
        System.out.println("saldo atual: "+c1.consultaSaldo());
        c1.depositar(1000);
        
        System.out.println("saldo atual: "+c1.consultaSaldo());
        c1.sacar(200);
        System.out.println("saldo atual: "+c1.consultaSaldo());

    }
}