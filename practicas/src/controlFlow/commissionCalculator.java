package controlFlow;
import java.util.*;
public class commissionCalculator {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("ingresa tu numero de ventas");
		double sales=scan.nextDouble();
		double commission=0;
		if (sales>10000) {
			commission=sales*0.3;
			System.out.println("tu comision es"+commission);
		} else if (sales>500 && sales<10000) {
			commission=sales*0.2;
			System.out.println("tu comision es"+commission);
		}else if (sales>1000 && sales <5000) {
			commission=sales*0.1;
			System.out.println("tu comision es"+commission);
		}else {
			System.out.println("no hay comision");
		}
	
	}
}
