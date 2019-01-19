import java.util.Scanner;

public class CollatzConjecture {
	
	// Void methods to help shorten the print statements
	public static void println(String s) {
		System.out.println(s);
	}
	
	public static void println(int i) {
		System.out.println(i);
	}
	
	public static void print(String s) {
		System.out.print(s);
	}
	
	public static void print(int i) {
		System.out.print(i);
	}
	
	/*
	 * Method initializes a count variable, and then determines whether the number
	 * is even or odd. It then prints out the final number in the sequence, 1, and 
	 * forces the program to quit in order to avoid infinite loops
	 */
	public static void collatzCalc(int i) {
		int count = 0;
		
		// Loop continues to run until 1 is the result
		while (i != 1) {
			// If n is even
			if (i % 2 == 0) {
				i = i / 2;
				println(i);
				count++;
			}
			
			// If n is odd
			else if (i % 2 != 0) {
				i = (3 * i) + 1;
				println(i);
				count++;
			}
		}
		println(i);
		println(" ");
		println("Number of calculations: " + count);
		System.exit(0);
	}
	
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		
		println("The concept of the Collatz Conjecture is that any");
		println("number greater than 0 will eventually end in 1 through");
		println("mathematical calculations. If the number n is even, then it");
		println("will be divided by two. If n is odd, then it will be plugged");
		println("into the formula 3n + 1, and then result in a number. Eventually,");
		println("the number will reach 1, which then creates an infinite loop");
		println("(3 * 1) + 1 = 4, then 4 / 2 = 2, and then 2 / 2 = 1.");
		
		println(" ");
		
		println("Please enter in a number greater than 1: ");
		
		int n = kb.nextInt();
		
		collatzCalc(n);		
	}
}
