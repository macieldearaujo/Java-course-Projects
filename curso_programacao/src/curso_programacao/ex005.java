package curso_programacao;

public class ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.printf("Raiz quadrada de %d%n", x);
		System.out.printf("Raiz quadrada de %d%n", y);
		System.out.printf("Raiz quadrada de %d%n", z);
		
		A = Math.pow(A, B);
	}

}
