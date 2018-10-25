package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.println("Input year and press Enter");
		
		a = scan.nextInt();

		int b = a % 400;
		int c = a % 100;
		int d = a % 4;
		
		if (d < 1 && c >= 1) {
			System.out.println("This leap year");
		} else if (b < 1) {
			System.out.println("This leap year");
		} else  {
			System.out.println("This regular year");
		}
		
		scan.close();

	}

}

