/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.mcmikius15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author michailbondarenko
 */
public class Main {
    
public static void main(String[] args) {
    
    Date date = new Date();
    SimpleDateFormat sdfOne = new SimpleDateFormat("'Today is 'G y MMMM ww Z");
    SimpleDateFormat sdfTwo = new SimpleDateFormat("dd:MM:yyyy");
    
    String myDate = "15:07:1987";
    
    try {
        date = sdfTwo.parse(myDate);
        
    } catch (ParseException e) {
        
        e.printStackTrace();
    
    }
    
    
    
    String result = sdfOne.format(date);
    
    System.out.println(result);
    
    result = sdfTwo.format(date);
    
    System.out.println(result);
    
    System.out.println(date.getTime());
    }


    
}
