package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input recktangle height");
		int a = scan.nextInt();
		
		System.out.println("Input recktangle weight");
		int b = scan.nextInt();
		
		
		String c = "*";
		String d = " ";
		
		for (int i = 0; i < a; i++) {
			if (i == 0 || i + 1 == a) {
				for (int j = 0; j < b; j++) {
					{
						System.out.print(c);
					}
				}
			} else {
				for(int j = 0; j < b; j++){
					if(j == 0 || j + 1== b){
						
						System.out.print(c);
						
					} else {
						System.out.print(d);
					}
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
