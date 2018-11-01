/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskonelessonsfive;

/**
 *
 * @author michailbondarenko
 */
public class TaskOneLessonsFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        int [] numbers = {0,5,2,4,7,1,3,19};
        for (int i: numbers) {
            if (i%2!=0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
    
