import java.util.Scanner;

/**
 * ex_5
 */
public class ex_5 {

    public static int F(int n) {
        int Fn = 0;
        if (n < 1) {
            return 0;
        }
         if(n==1) {
            return 1;
        } 
        else{
        // while (i<n) {
        //     Fn = F(i-2,i)+F(i-1,i);
        //     System.out.println("i: "+i+"| i-2: "+(i-2)+"| i-1: "+(i-1)+"| Fn: "+Fn);
        //     System.out.println("i: "+i+" | Fn: "+Fn);
        //     i++;
        // }
            return F(n-2)+F(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Digite o numero de Fibonacci desejado: ");
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        System.out.println(F(n));
     
    
    }
}