package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
    	int a;
    	
        int b;
        
        int c;
        
        int d;
        
        int max;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input a:");
        
        a= scan.nextInt();
        System.out.println("Input b:");
        
        b= scan.nextInt();
        System.out.println("Input c:");
        
        c=scan.nextInt();
        System.out.println("Input d:");
        
        d= scan.nextInt();
        max=a;
        
        if (c>max){
            max=c;
        }
        
        if (b>max){
            max=b;
        }
        
        if (d>max){
            max=d;
        }
        
        System.out.println("Max =" +max );
        
        scan.close();
    }


}
