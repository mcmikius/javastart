/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskthreelessonsix;

import java.util.Scanner;
/**
 *
 * @author michailbondarenko
 */
public class TaskThreeLessonSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input a side  ");
        Scanner scanOne = new Scanner(System.in);
	System.out.println("Input b side  ");
        Scanner scanTwo = new Scanner(System.in);
	
        
        int a = scanOne.nextInt();
	int b = scanTwo.nextInt();
                
        drawRectangle(a, b);
	}

	static void drawRectangle(int a, int b) {

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				if (j == 0 || j == b || i == 0 || i == a) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
  
}
