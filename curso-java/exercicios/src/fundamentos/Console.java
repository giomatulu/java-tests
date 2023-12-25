package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu cpf:");
		
		String cpf = entrada.nextLine();
		
		System.out.println("O seu cpf é X, correto?"
				.replace("X", cpf));
		
		entrada.close();
	}

}
