import java.util.Scanner;

/**
 * ex_7
 */
public class ex_7 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     Integer auxInteger = 0;
     System.out.println("Digite um número inteiro: ");
     String valor = scanner.nextLine();
    char [] valor_char = valor.toCharArray();

    for(char c: valor_char){
        auxInteger+=Character.getNumericValue(c);

    }
    System.out.println("Soma de todos os algarismos: "+auxInteger);
    
    }
}