package controlDeFlujo;
import java.util.Scanner;
public class ageTernario {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("ingresa tu edad:");
		int age = scan.nextInt();
		String result = ( age>=18 && age <=150)?"Eres mayor de edad":"Eres menor de edad" ;
		String res = ( age>=0 && age <=150)?result :"fuera de rango" ;

		System.out.println(res);
		

	}
}
