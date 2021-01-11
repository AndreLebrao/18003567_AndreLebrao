package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double n1,n2;
        System.out.print("Dois float pf: ");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();

        if(n1>n2){
            System.out.println("N1 eh maior");
        }else{
            System.out.println("N2 eh maior");
        }


    }
}
