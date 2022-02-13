package primeiro.projeto;

public class Habilitacao {

	public static void main(String[] args) {
	 
       String nome = "Taty";
		int idade = 10;
		int idadePermitida = 18;
		boolean emancipado = false;
		
		if(idade >= idadePermitida || emancipado) {
			System.out.println(" Você pode tirar habilitação " + nome );
			
		}else {
			System.out.println("Você não pode tirar habilitação " + nome);
			
		}

	}

}
