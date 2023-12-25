package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		double treinoAluno = 5;
		boolean boaAlimentaçao = true;
		boolean treinoSemanal = treinoAluno >= 4;
		boolean resultadosCorpo = boaAlimentaçao && treinoSemanal;
		
		System.out.println("Vai ter resultados rápidos no corpo? " +
				resultadosCorpo);
		
	}

}
