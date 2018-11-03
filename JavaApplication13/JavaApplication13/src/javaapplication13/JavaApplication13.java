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
        
        String[] goods = new String[] {"Americano", "Latte", "Capuchinu", "Espresso", "tea"};
        int[] price = new int[] {7, 8, 8, 8, 7};
        int[] cups = new int[] {46, 69, 73, 52, 23};
        
        String report = getCSVReport(goods, price, cups);
        
        File file = new File("report.csv");
        
        saveStringToFile(report, file);

    }
    
    public static void saveStringToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String getCSVReport(String[] goods, int[] price, int[] cups) {
        String report = "";
        for (int i = 0; i < goods.length; i++) {
            report += goods[i] + ";" + price[i] + ";" + cups[i];
            report += System.lineSeparator();
        }
        
        return report;
    }
    
}
