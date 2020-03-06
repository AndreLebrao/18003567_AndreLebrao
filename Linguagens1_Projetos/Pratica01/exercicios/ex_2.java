import java.util.Scanner;

/**
 * ex_2
 */
public class ex_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite seu nome: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade2 = scanner.nextInt();

        int dif = Math.abs(idade1-idade2);
        
        if (idade1>idade2) {
            System.out.println(nome1+" é mais velho.");
        } else {
            System.out.println(nome2+" é mais velho.");
        }
        System.out.println("diferenca: "+dif);
    }
}