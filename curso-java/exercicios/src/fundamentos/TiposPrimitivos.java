package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// informações do funcionário
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 36_426;
		long pontosAcumulados = 3_456_738_923L;
		
		// tipos numéricos reais
		float salario = 11_453.98F;
		double vendasAcumuladas = 2_984_837_109.01;
		
		// tipo booleano
		boolean estaDeFerias = false;
		
		// tipo caractere
		char status = 'A'; // ativo
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> R$" + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
	

}
