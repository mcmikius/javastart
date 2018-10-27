package com.gmail.mcmikius15;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 5;
		int d = -1;
		
		int e = sum(c, d) + 7;
		
		System.out.println(e);
                
                int[] array = new int[] {3,8,11};
                
                printArray(array);

	}
	
	public static int sum(int a, int b) {
		int summa = a + b;
		return summa;
	}
        
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        
        }

}
