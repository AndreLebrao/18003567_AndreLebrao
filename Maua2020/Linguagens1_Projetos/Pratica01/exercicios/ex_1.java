import java.util.Scanner;

/**
 * ex_1
 */
public class ex_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu RA : ");
        String ra = scanner.nextLine();
        System.out.println("Informe seu Nome : ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu telefone : ");
        int tel = scanner.nextInt();
        // toda vez que usar scanner.nextInt() precisa dar um scanner.nextLine() pq o nextint nao escaneia o enter que da pra pular linha 
        scanner.nextLine(); 
        System.out.println("Informe seu email : ");
        String email = scanner.nextLine();
        
        System.out.println("Informe seu idade : ");
        int idade = scanner.nextInt();
        
        System.out.println("\n\nRA: "+ra);
        System.out.println("Nome: "+nome);
        System.out.println("telefone: "+tel);
        System.out.println("email: "+email);
        System.out.println("idade: "+idade);
    }
}