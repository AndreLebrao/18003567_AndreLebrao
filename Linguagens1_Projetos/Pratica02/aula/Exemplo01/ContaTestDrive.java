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
        c1.titular = "Odair";
        Conta c2 = new Conta();
        c2.titular = "Goku";
        System.out.println("Titular: "+c1.titular);
        System.out.println("Titular c2: "+c2.titular);


    }
}