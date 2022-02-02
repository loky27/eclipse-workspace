package loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		String name = console.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}
}	
