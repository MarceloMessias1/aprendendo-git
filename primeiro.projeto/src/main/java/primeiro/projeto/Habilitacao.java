package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {
	 
       String nome = "Taty";
		int idade = 10;
		int idadePermitida = 18;
		boolean emancipado = false;
		
		if(idade >= idadePermitida || emancipado) {
			System.out.println(" Voc� pode tirar habilita��o " + nome );
			
		}else {
			System.out.println("Voc� n�o pode tirar habilita��o " + nome);
			
		}

	}

}
