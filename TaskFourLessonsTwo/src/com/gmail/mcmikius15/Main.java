package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the first side of a triangle");
		double a = scan.nextDouble();

		System.out.println("Input the second side of a triangle");
		double b = scan.nextDouble();

		System.out.println("Input the third side of a triangle");
		double c = scan.nextDouble();

		if ((a + b) > c && (b + c) > a) {
			System.out.println("This triangle exist");
		} else {
			System.out.println("This triangle exists does not exist");
		}
		
		scan.close();
	}
}
