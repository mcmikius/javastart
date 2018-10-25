package com.gmail.mcmikius15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
    int appartmentNumber;
      System.out.println("Please input appartment number: ");
      appartmentNumber = scan.nextInt();
    if (appartmentNumber <= 144) {
      System.out.println("Enter# " +((appartmentNumber+35)/36));
      System.out.println("Flor# "+((((appartmentNumber-1)%36)/4)+1));
    }
    else {
      System.out.println("There is no such appartment");
    }
      scan.close();
    }
}
