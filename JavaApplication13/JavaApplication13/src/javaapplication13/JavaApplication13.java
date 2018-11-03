/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
        

/**
 *
 * @author michailbondarenko
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Hello world";
        File file = new File("hello.txt");
        
        saveStringToFile(text, file);
    }
    
    public static void saveStringToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
