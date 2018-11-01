/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskonelessonsix;

import java.util.Random;
        

/**
 *
 * @author michailbondarenko
 */
public class TaskOneLessonSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
		
		Random random = new Random();
		for(int i = 0; i < array.length; i++){
			array[i] = random.nextInt(100);
		}
		print(array);
		
		System.out.println("\nMax number: " + maxNumber(array));

	}
	
	private static int maxNumber(int[] array){
		int tempMax = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] > tempMax){
				tempMax = array[i];
			}
		}
		return tempMax;
	}
	
	static void print(int[] array){
		for(int a:array){System.out.print(a+" ");} 
    }
    
}
