/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktwolessonsfive;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author michailbondarenko
 */
public class TaskTwoLessonsFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input your array  ");
        Scanner scanOne = new Scanner(System.in);
        int lenght = scanOne.nextInt();
        int array[] = new int[lenght];
        System.out.println("Input array values  ");
        Scanner scanTwo = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanTwo.nextInt();
        }
        System.out.println("Your Array includes "+ Arrays.toString(array));
    }
}
