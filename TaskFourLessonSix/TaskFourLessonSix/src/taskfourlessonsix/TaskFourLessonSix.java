/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfourlessonsix;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author michailbondarenko
 */
public class TaskFourLessonSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Input some number from 0 to 9 ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int[] arrayRandom = new int[10];
        Random random = new Random();
	for(int i = 0; i < arrayRandom.length; i++){
	arrayRandom[i] = random.nextInt(10);
	}
	print(arrayRandom);
                
		
		int index = searchElement(arrayRandom, num);
		if (index == -1) {
			System.out.println("There's no such number in array! Error # " + index);
		}
		System.out.println("Last index is : " + index);
	}

	static int searchElement(int[] array, int number) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				if (i != -1) {
					System.out.println(i);
				}
				index = i;
			}
		}
		return index;
        } 
     static void print(int[] arrayRandom){
         for(int a:arrayRandom){System.out.print(a+" ");}
     } 
    }
    


