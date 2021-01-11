import java.util.Scanner;

/**
 * ex_6
 */
public class ex_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o último valor: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        int soma = 0;
        int produto = 1;
        
        while(a<b){
            soma+=a;
            produto*=a;
            a++;

        }


        System.out.println("soma: "+soma);
        System.out.println("produto: "+produto);

    }
}