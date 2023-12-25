package fundamentos.operadores;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {
	
	public static void main(String[] args) {
		
		Scanner pedeNumero = new Scanner(System.in);
		System.out.println("Advinhe um número de 0 a 10:");
		String numeroAdvinhado = pedeNumero.nextLine();
		
		
		Random random = new Random();
		int numeroGerado = random.nextInt(11);
		System.out.println("O número gerado era: " + numeroGerado);
		
		String numero = Integer.toString(numeroGerado);
		
		boolean confere = numeroAdvinhado.equals(numero);
		
		boolean acertou = confere == true;
		
			if (acertou == true) {
				
				System.out.println("Acertou!"); }
				
					else {
					
					System.out.println("Errou!");
				}
			
		pedeNumero.close();
			}
			
		
		
	}


