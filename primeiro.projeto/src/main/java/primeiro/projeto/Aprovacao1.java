package primeiro.projeto;

public class Aprovacao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1 = 1.0;
		double nota2 = 1.0;
		double nota3 = 10;
		double media = (nota1 + nota2+ nota3) / 3;
		double notaAprovacao = 7.0;
		boolean falta = true;
		boolean partic = true;
		
		if (media >= notaAprovacao && falta && partic){
			
System.out.println("Aprovado");
			
		}else {
			
			System.out.println("reprovado");
		}
			
		

		
		
		
	}

	
	
	
}
