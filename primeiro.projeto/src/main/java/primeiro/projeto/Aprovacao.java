package primeiro.projeto;

public class Aprovacao {

	public static void main(String[] args) {

		double nota1 = 10;
		double nota2 = 10;
		double nota3 = 10;
		double media = (nota1 + nota2 + nota3) / 3;
		double notaAprovacao = 8.0;
		boolean falta = true;
		boolean disc = true;
		boolean partic = true;
		boolean puxa = true; 
		
		if (media >=notaAprovacao && falta && disc && partic && puxa) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno Reprovado");
		
		}
			
		
	}

}
