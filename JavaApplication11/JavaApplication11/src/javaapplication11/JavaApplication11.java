/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author michailbondarenko
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(doubleToString(Math.PI, 10));
    }
    public static String doubleToString(double number, int n) {
        String result = String.format("%." + n + "f", number);
        return result;
    
    }
}
