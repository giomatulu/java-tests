package fundamentos;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		Scanner entradaUm = new Scanner(System.in);
		System.out.println("Escolha um login:");
		String login = entradaUm.nextLine();
		
		Scanner entradaDois = new Scanner(System.in);
		System.out.println("Escolha uma senha:");
		String senha = entradaDois.nextLine();
		
		Scanner entradaLoginUsuario = new Scanner(System.in);
		System.out.println("Digite o seu login:");
		String entradaLogin = entradaLoginUsuario.nextLine();
		
		System.out.println(entradaLogin.equalsIgnoreCase(login));
		
		Scanner entradaSenhaUsuario = new Scanner(System.in);
		System.out.println("Digite a sua senha:");
		String entradaSenha = entradaSenhaUsuario.nextLine();
		
		System.out.println(entradaSenha.equals(senha));
		
		entradaSenhaUsuario.close();
		entradaLoginUsuario.close();
		entradaDois.close();
		entradaUm.close();
		
		
		
	}

}
