package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// ler num1
		// ler num2
		// + - / * %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = entrada.nextDouble();
	
		System.out.println("Digite o segundo número:");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o símbolo da operação:\n" +
				"+ | - | / | * | %");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.println(resultado);
		
		
	
		
		
		
		
		
		
		
	}

}
