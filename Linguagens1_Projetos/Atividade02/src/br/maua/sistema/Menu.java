package br.maua.sistema;

import java.util.ArrayList;
import java.util.Scanner;

import br.maua.enums.SystemTime;
import br.maua.interfaces.MemberApresentacao;
import br.maua.models.BigBrother;
import br.maua.models.HeavyLifter;
import br.maua.models.Member;
import br.maua.models.MobileMember;
import br.maua.models.ScriptGuy;

public abstract class Menu implements MemberApresentacao{
    
    private static ArrayList<Member> memberList = new ArrayList<>();
    private static SystemTime sTime = SystemTime.REGULAR;
    
    public static void trocarSystemTime(){
        if (sTime.equals(SystemTime.REGULAR)) {
            sTime = SystemTime.EXTRA;
        } else {
            sTime = SystemTime.REGULAR;
        }
    }
    public static String getSystemTime(){
        if (sTime.equals(SystemTime.REGULAR)) {
            return "Regular";
        } else {
            return "Extra";
        }
    }

    //TODO: encapsular os metodos cadastrar e remover members, mas precisa lidar com o scanner abrindo e fechando
    public static void run(){
        boolean flag = true;
        int option;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Escolha uma opção: \n1 - Cadastrar\n2 - Remover\n3 - Postar Mensagem\n4 - Apresentar\n5 - Trocar Hora de Trabalho\n0 - Sair");
            System.out.printf("Hora de trabalho: %s\n\n",getSystemTime());
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    // try {
                            //TODO: colcoar da linha 53 a 75 aqui dentro
                    // } catch (Exception e) {
                    //     //TODO: handle exception
                    // }
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("\nEscolha o cargo:\n1 - Mobile Member\n2 - Heavy Lifter\n3 - Big Brother\n4 - Script Guy\n");
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
                    System.out.println("Digite o ID do membro a ser retirado: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    memberList.remove(index);
                    break;
                case 3:
                    for (Member member : memberList) {
                        member.postarMensagem("", sTime);
                    }
                    break;

                case 4:
                    int ID = 0;
                    for (Member member : memberList) {
                        System.out.printf("ID: "+ID);
                        member.apresentar();
                        ID++;
                    }
                    break;
                
                case 5:
                    trocarSystemTime();
                    break;
                default:
                    break;
            }
        }

    }
}