package _01_sequentialStructure;

public class ex005 {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		// Math.sqrt = Raiz Quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.printf("Raiz quadrada de %.1f = %.16f%n", x, A);
		System.out.printf("Raiz quadrada de %.1f = %.1f%n", y, B);
		System.out.printf("Raiz quadrada de 25 = %.1f%n", C);
		
		// Math.pow = Potência
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.printf("%.1f elevado a %.1f = %.1f%n", x, y, A);
		System.out.printf("%.1f elevado ao quadrado = %.1f%n", x, B);
		System.out.printf("5 elevado ao quadrado = %.1f%n", C);
		
		// Math.abs = Valor Absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.printf("Valor absoluto de %.1f = %.1f%n", y, A);
		System.out.printf("Valor absoluto de %.1f = %.1f%n%n", z, B);
		
		// Fórmula de Bhaskara
		double delta, a, b, c, x1, x2;
		
		a = 1;
		b = -3;
		c = -54;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("Resultado Bhaskara:");
		System.out.println(x1 + " e " + x2);
	}
}