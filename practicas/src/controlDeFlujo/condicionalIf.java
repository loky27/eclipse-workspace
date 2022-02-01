package controlDeFlujo;
import java.util.Scanner;
public class condicionalIf {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("ingresa tu edad:");
		int age = scan.nextInt();
		
		if ( age>=18 && age <=150) { 
			System.out.println("Eres mayor de edad");
			} else if(age<18 && age>=0 ) { 
				System.out.println("Eres menor de edad");
				
			} else{ 
				System.out.println("Elrango de edad es incorrecrto");
			} 
	}
}

