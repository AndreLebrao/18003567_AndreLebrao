import java.util.Scanner;

/**
 * ex_4
 */
public class ex_4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuffer frase = new StringBuffer();
        StringBuffer inverso = new StringBuffer();
        
        System.out.println("Digite uma frase para ver se é ou não palíndromo: ");
        String digitado = scanner.nextLine();
        frase.append(digitado);
        inverso.append(frase.toString());

        inverso.reverse();
        if (frase.equals(inverso)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        
        
    }
}