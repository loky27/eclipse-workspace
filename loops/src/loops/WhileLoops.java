package loops;

import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		int num; System.out.print("Enter any positive integer: ");
		num = console.nextInt(); 
		System.out.println("Multiplication Table of " + num);
		System.out.println("Se imprimira la tabla del "+num); 
		int i=1;
		while (i <11) { 
			System.out.println(num+"x"+i+"="+num*i);
			i++; 
			} 
	}
}
