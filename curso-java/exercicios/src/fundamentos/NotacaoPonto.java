package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Olá X, tudo bem?! Seja bem vindo";
		s = s.replace("X", "Henrique");
		s = s.toUpperCase();
		s = s.concat("!!!!!!!!!!!");
		
		System.out.println(s);
		
		String h = "Henrique lindo <3"
				.replace("lindo", "gostoso")
				.toUpperCase()
				.concat(" AAAAAAAAAA");
		
		System.out.println(h);
		
	}
}
