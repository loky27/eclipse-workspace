package funciones;

import java.util.Scanner;

public class calculadora {
	static Double suma(Double a,Double ...b) {
		for (int i = 0; i < b.length; i++) {
			a+=b[i];
		}
		return a;
	}
	static Double resta(Double a,Double ...b) {
		for (int i = 0; i < b.length; i++) {
			a-=b[i];
		}
		return a;
	}
	static Double mult(Double a,Double ...b) {
		for (int i = 0; i < b.length; i++) {
			a*=b[i];
		}
		return a;
	}
	static Double divid(Double a,Double ...b) {
		for (int i = 0; i < b.length; i++) {
			a/=b[i];
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("ingresa un valor ");
		Double date1 = console.nextDouble();
		System.out.println("ingresa un valor ");
		Double date2 = console.nextDouble();

		System.out.println(suma(date1,date2));
		System.out.println(resta(date1,date2));
		System.out.println(mult(date1,date2));
		System.out.println(divid(date1,date2));
	}
}
