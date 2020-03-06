import java.util.Scanner;

/**
 * ex_3
 */
public class ex_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a user: ");
        String user = scanner.nextLine();
        System.out.println("digite a senha");
        String senha = scanner.nextLine();
        String confirmacao = " ";
        while (!senha.equals(confirmacao)) {
            System.out.println("digite a senha novamente: ");
            confirmacao = scanner.nextLine();
        }
    }
}