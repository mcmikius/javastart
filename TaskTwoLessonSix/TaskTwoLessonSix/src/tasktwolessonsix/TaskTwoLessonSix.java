/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktwolessonsix;

/**
 *
 * @author michailbondarenko
 */
public class TaskTwoLessonSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        String text = "Hello World!";
	int numInt = 15;
	double numDouble = 3.15;
		System.out.println(concat(text, numInt, numDouble));
	}

	static String concat(String a, int b, double c) {
		String sumConcat = a + (b + c);
		return sumConcat;
    }
    
}
