package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		String s = "Boa noite";
		System.out.println(s.concat("!!!"));
		
		var nome = "Henrique";
		var sobrenome = "Matulu";
		var idade = 24;
		var salario = 69_696.96;
		
		// %s para string, %d para valores inteiros
		// e %f para valores float.
		System.out.printf("O senhor %s %s tem %d e "
				+ "recebe R$%.2f.", nome, sobrenome, idade, 
				salario);
	}
}
