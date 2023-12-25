package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// trabalho na terça (v ou f)
		// trabalho na quinta (v ou f)
		// se só um trabalho der certo vai comprar a de 32''
		// se os dois derem vai comprar a de 50''
		// qualquer tv que compre vai tomar sorvete
		// se nenhum deu certo nao acontece nada
		
		// 50'' -- and
		// 32'' -- xor
		// sorvete -- xor
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean tvCinquenta = trabalho1 && trabalho2;
		System.out.println("Comprou tv cinquenta? " + tvCinquenta);
		System.out.println("Toda a família ganha TV de 50''!!\n");
		
		boolean tvTrinta = trabalho1 ^ !trabalho2;
		System.out.println("Comprou tv trinta? " + tvTrinta);
		System.out.println("Toda a família ganha TV de 32''!!\n");
		
		boolean comprouTv = tvCinquenta || tvTrinta;
		boolean semTv = false;
		
		boolean sorvete = comprouTv ^ semTv;
		System.out.println(sorvete);
		System.out.println("Toda a família ganhha sorvete!!\n");
		
		boolean semSorvete = !semTv;
		System.out.println(semTv);
		System.out.println("Ninguém ganha sorvete :(");
		
		

	}

}
