//Formato de numeros
//Author: Christian Tipantuña

public class FormatoNumeros {
	public static void main(String[] args) {
		
		long numero = 123098;
		double pi = Math.PI;
		double n = numero;

		System.out.printf("%d %n", numero);
		System.out.printf("%08d %n", numero);
		System.out.printf("%+d %n", numero);
		System.out.printf("%.3f %n", n/1000); 
		System.out.printf("%+.3f %n", n/1000); 
		System.out.printf("%f %n", pi);
		System.out.printf("%.3f %n", pi);
		System.out.printf("%10.3f %n", pi);
		System.out.printf("%.4f %n", pi);
	}
}