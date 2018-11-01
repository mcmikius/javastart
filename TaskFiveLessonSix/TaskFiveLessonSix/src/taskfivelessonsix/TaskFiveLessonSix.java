/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfivelessonsix;
import java.util.Scanner;
/**
 *
 * @author michailbondarenko
 */
public class TaskFiveLessonSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input some text");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
	
        System.out.println("In this line " + words(text) + " words.");

	scan.close();
	}
	
	public static int words(String a) {
		String[] b = a.split("[ ]");
		int num = b.length;
		return num;
	}
}

    

