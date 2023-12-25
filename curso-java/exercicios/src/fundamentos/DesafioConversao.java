package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entradaUmSalario = new Scanner(System.in);
		System.out.println("Digite o primeiro salário: ");
		String salarioUm = entradaUmSalario.nextLine()
				.replace(".", "").replace(",", "");
		
		Scanner entradaDoisSalario = new Scanner(System.in);
		System.out.println("Digite o segundo salário: ");
		String salarioDois = entradaDoisSalario.nextLine()
				.replace(".", "").replace(",", "");
		
		Scanner entradaTresSalario = new Scanner(System.in);
		System.out.println("Digite o terceiro salário: ");
		String salarioTres = entradaTresSalario.nextLine()
				.replace(".", "").replace(",", "");
		
		double salario1 = Double.parseDouble(salarioUm);
		double salario2 = Double.parseDouble(salarioDois);
		double salario3 = Double.parseDouble(salarioTres);
		
		double mediaSalario = (salario1 + salario2 
				+ salario3) / 3;
		
		System.out.printf("A média salarial é: R$'" + mediaSalario);
		
		entradaDoisSalario.close();
		entradaTresSalario.close();
		entradaUmSalario.close();
		
		
	}

}
