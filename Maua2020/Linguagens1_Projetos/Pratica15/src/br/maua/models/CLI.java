package br.maua.models;

import java.util.Scanner;
import br.maua.models.Leitura;
public class CLI {

    public static void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String plataform,region,user,tag,inUrl;
        while(true){
            System.out.println("Plataforma (pc, etc): ");
            plataform = scanner.nextLine();
            System.out.println("Região (us, eu, asia): ");
            region = scanner.nextLine();
            System.out.println("Usuário: ");
            user = scanner.nextLine();
            System.out.println("BattleTag sem #: ");
            tag = scanner.nextLine();
//            https://ow-api.com/v1/stats/pc/us/sgtandrewBR-1914/profile
            inUrl = "https://ow-api.com/v1/stats/"+plataform+"/"+region+"/"+user+"-"+tag+"/profile";
            Leitura.leituraJava11(inUrl);
            System.out.println("De novo? (s/n) ");
            if(scanner.nextLine().equalsIgnoreCase("n"))
                break;
        }
    }

}
