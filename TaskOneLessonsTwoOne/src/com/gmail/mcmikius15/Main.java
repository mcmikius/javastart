package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Input stripe number");
		
        Scanner scan=new Scanner(System.in);
        
        int numberStripes=scan.nextInt();
        
        int j=1;
        
        for (int i=1;i<=5;i++){
        	
            while (j <= numberStripes) {
            	
                if (j%2==0){
                	
                    System.out.print("+++");
                    
                } else {
                	
                    System.out.print("***");
                    
                }
                
                j++;
                
            }
            
            System.out.println();
            
            j=1;
            
        }

		scan.close();
	}

}
