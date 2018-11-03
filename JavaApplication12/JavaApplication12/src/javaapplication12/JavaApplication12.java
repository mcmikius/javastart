/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author michailbondarenko
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File fileOne = new File("a.txt");

        try {
            fileOne.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        File folderOne = new File("AAA");
        
        folderOne.mkdirs();
        
        File fileTwo = new File(folderOne, "c.txt");
        
        try {
            fileTwo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        fileOne.delete();
        fileTwo.delete();
        folderOne.delete();
        
        
        File workFolder = new File(".");
        File [] files = workFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
        System.out.println(files[i]);
    }
    }
    
}
