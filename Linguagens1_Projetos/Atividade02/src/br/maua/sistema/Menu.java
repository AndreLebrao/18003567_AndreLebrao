package br.maua.sistema;

import java.util.ArrayList;
import java.util.Scanner;

import br.maua.interfaces.MemberApresentacao;
import br.maua.models.BigBrother;
import br.maua.models.HeavyLifter;
import br.maua.models.Member;
import br.maua.models.MobileMember;
import br.maua.models.ScriptGuy;

public abstract class Menu implements MemberApresentacao{

    private static ArrayList<Member> memberList = new ArrayList<>();
    
    
    // @Override
    // public static void apresentar(ArrayList<Member> list) {
    //     int i = 0;
    //     for (Member member : list) {
    //         System.out.printf("%i - %s",i,member.getNomeUsuario());
    //         i++;
    //     }
    // }

    public static void run(){
        boolean flag = true;
        int option;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Escolha uma opção: \n1 - Cadastrar\n2 - Remover\n3 - Postar Mensagem\n4 - Apresentar\n5 - Trocar Hora de Trabalho\n0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Escolha o cargo:\n1 - Mobile Member\n2 - Heavy Lifter\n3 - Big Brother\n4 - Script Guy\n");
                    int cargo = scanner.nextInt();
                    scanner.nextLine();
                    switch (cargo) {
                        case 1:
                            memberList.add(new MobileMember(nome, email));
                            break;
                        case 2:
                            memberList.add(new HeavyLifter(nome, email));
                            break;
                        case 3:
                            memberList.add(new BigBrother(nome, email));
                            break;
                        case 4:
                            memberList.add(new ScriptGuy(nome, email));
                            break;
                        default:
                            break;
                    }
                    break;
                
                case 2:
                    System.out.println("remover");
                    break;
                case 3:
                    System.out.println("postar msg");
                    break;

                case 4:
                    
                    for (Member member : memberList) {
                        member.apresentar(); 
                        
                    }
                    
                    break;
                
                case 5:
                    System.out.println("trocar hora");
                    break;
                default:
                    break;
            }
            System.out.println("\n\n");
        }

    }
}