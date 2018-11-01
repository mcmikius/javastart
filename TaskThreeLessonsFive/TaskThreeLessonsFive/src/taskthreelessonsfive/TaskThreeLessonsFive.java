/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskthreelessonsfive;
import java.util.Arrays;
/**
 *
 * @author michailbondarenko
 */
public class TaskThreeLessonsFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[15];
		
		for (int i = 0; i < array.length; i += 1) {
			array[i] = (int) (Math.random() * 100 + 1);
		}

		int[] arrayResult = Arrays.copyOf(array, array.length * 2);
		for (int i = array.length; i < arrayResult.length; i += 1) {
			arrayResult[i] = arrayResult[i - array.length] * 2;
		}
		
		System.out.println("It was: " + Arrays.toString(array));
		System.out.println("It be: " + Arrays.toString(arrayResult));
    }
    
}
