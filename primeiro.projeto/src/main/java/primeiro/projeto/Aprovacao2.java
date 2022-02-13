package primeiro.projeto;

public class Aprovacao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1 = 10;
		double nota2 = 0;
		double nota3 = 10;
		double media = (nota1 + nota2 + nota3) / 3;
		double mediaAprovacao = 5;
		boolean partic = true;
		boolean puxa = false;
		
		
		
		if (media >= mediaAprovacao && partic && puxa) {
System.out.println("Aprovado");


		}else {
			
			System.out.println("Reprovado");
		}

	}

}
