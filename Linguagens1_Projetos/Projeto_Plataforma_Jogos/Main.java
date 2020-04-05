/**
 * Main
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        boolean ui = true;

        while (ui) {
            
            System.out.println("Escolha uma opção:\n1 - Logar\n2 - Registrar\n3 - Sair\n");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    ui = false;
                    break;

            }
        CLS.cls();
        }
        

    }
}

        // String nome, genero, descricao;
        // System.out.println("Informe nome, genero, descricao:");
        // nome = scanner.nextLine();
        // genero = scanner.nextLine();
        // descricao = scanner.nextLine();

        // Jogo j1 = new Jogo(nome, genero, descricao);
        // System.out.println("J1:" + j1.getInfo());

        // System.out.println("Informe nick:");
        // String nick;
        // nick = scanner.nextLine();
        // Usuario usuario = new Usuario(nick, "123", "");
        // Conta conta = new Conta(usuario);
        // System.out.println("Dados da conta:" + conta.getInfo());
        // conta.addCreditos(50.00);
        // for(int i = 0; i < 5; i++)
        //     conta.addJogo(j1);
        // System.out.println("Dados da conta:" + conta.getInfo());
        // scanner.close();