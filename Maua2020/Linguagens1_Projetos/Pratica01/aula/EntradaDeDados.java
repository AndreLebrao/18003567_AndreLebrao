import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			String nome;
			System.out.print("Qual teu nome: ");
			nome = scanner.nextLine();
			System.out.println("Ola "+nome);
			int n1,n2;
			System.out.println("Manda 2 numeros ae: ");
			n1 = scanner.nextInt();
			n2 = scanner.nextInt();
			System.out.println("Soma: "+(n1+n2));
	}	

}
