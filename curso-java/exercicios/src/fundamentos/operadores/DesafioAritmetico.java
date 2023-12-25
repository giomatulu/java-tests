package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		System.out.println(a);
		
		double b = Math.pow(a, 2);
		System.out.println(b);
		
		double c = b / (3 * 2);
		System.out.println(c);     // 150
		
		//
		
		int x = (1 - 5) * (2 - 7);
		System.out.println(x);
		
		int y = x / 2;
		System.out.println(y);
		
		double z = Math.pow(y, 2);
		System.out.println(z);     // 100
		
		//
		
		double cz = c - z;
		System.out.println(cz);
		
		double cZElevado = Math.pow(cz, 3);
		System.out.println(cZElevado);
		
		double dezElevado = Math.pow(10, 3);
		System.out.println(dezElevado);
		
		double resultado = cZElevado / dezElevado;
		System.out.println(resultado); 
		
		
		
		
		

	}
}
