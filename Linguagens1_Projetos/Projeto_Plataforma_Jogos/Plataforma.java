import java.util.ArrayList;
import java.util.Scanner;

/**
 * Plataforma
 */
public class Plataforma {
    
    private static ArrayList<Conta> contas = new ArrayList<>();
    private static boolean startup = true;
    private static boolean paginaPrincipal = false;

    public static void addConta(Conta conta){
        contas.add(conta);
    }

    public static void startup() {
        Scanner scanner = new Scanner(System.in);
        while (startup) {
            
            System.out.println("Escolha uma opção:\n1 - Logar\n2 - Registrar\n3 - Sair\n");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Senha: ");
                    String password = scanner.nextLine();

                    for (Conta cada : contas) {
                        if(cada.validarUser(email, password)){
                            System.out.println("Login realizado com sucesso");
                            startup = false;
                            paginaPrincipal = true;
                            break;
                        }    
                    }
                    if(startup == true)
                        System.out.println("Usuário ou senha inválidos");
                    
                    break;
                case 2:
                    System.out.println("Escolha seu nickname: ");
                    String newNickname = scanner.nextLine();
                    System.out.println("Informe seu email: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("Escolha uma senha: ");
                    String newPassword = scanner.nextLine();
                    Usuario newUser = new Usuario(newNickname, newPassword, newEmail);
                    Conta newConta = new Conta(newUser);
                    addConta(newConta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 3:
                    startup = false;
                    break;

            }
            //cls vem aqui
        }
        scanner.close();
    }


}