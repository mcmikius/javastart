/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfourlessonsfive;
import java.util.Scanner;
/**
 *
 * @author michailbondarenko
 */
public class TaskFourLessonsFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scan.nextLine();
        char[] ch=text.toCharArray();
        char s = 'b';
        int count = 0;
        for(int a: ch){
            if (a == s)
                count++;
        }
        System.out.println(count);
    }
    
}
