package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Input number what more 4 and less 16:");
        
        int a = scan.nextInt();
        
        int f = 1;

        while (a < 4 || a > 16) {
        	
            System.out.println("Incorrect number! what more 4 and less 16:");
            
            a = scan.nextInt();
            
        }

        for (int i = a; i != 0; i--) {
        	
            f *= i;
            
        }
        System.out.println("Factorial = " + f);
        
        scan.close();

	}

}
