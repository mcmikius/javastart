package com.gmail.mcmikius15;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 5;
		int d = -1;
		
		int e = sum(c, d) + 7 + sum(1, 2, 3);
		
		System.out.println(e);
                
                int[] array = new int[] {3,8,11};
                
                printArray(array);

	}
	
        /**
         * 
         * Calculet sum two integer values.
         * 
         * @param a <code> int </code> First Integer number
         * @param b <code> int </code> Second Integer number
         * @return <code> int </code> returm sum first and second numbers
         * @author Michail_Bondarenko
         */
        
	public static int sum(int a, int b) {
		int summa = a + b;
		return summa;
	}
        
        public static int sum(int a, int b, int c) {
		int summa = a + b + c;
		return summa;
	}
        
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        
        }

}
