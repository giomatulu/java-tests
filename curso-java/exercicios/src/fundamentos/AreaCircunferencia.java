package fundamentos;

public class AreaCircunferencia {

	// ctrl + espaço para preencher o codigo automaticamente
	public static void main(String[] args) {
		double raio = 3.4;
		// final define uma constante, usar nomes de constante em maiúsculo
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("A área é: " + area + "m²");
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("A área é: " + area + "m²");
	}
}
