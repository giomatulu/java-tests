package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;          // implícita
		System.out.println(a);
		
		float b = (float) 1.0; // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}

}
