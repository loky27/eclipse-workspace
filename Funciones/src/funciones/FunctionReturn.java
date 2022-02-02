package funciones;



public class FunctionReturn {
	public static void main(String[] args) {
	System.out.println(suma(2,3,7));
 	}
	static int suma(int a,int ...b) {
		for (int i = 0; i < b.length; i++) {
			a+=b[i];
		}
		return a;
	}
}
