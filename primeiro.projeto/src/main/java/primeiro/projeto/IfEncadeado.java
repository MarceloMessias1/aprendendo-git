package primeiro.projeto;

public class IfEncadeado {

	public static void main(String[] args) {

		boolean opcao1 = false;
		boolean opcao2 = false;
		boolean opcao3 = false;

		if (opcao1) {
			System.out.println("Entrou na op��o 1");

			if (opcao2) {
				System.out.println("Entrou na op��o 2");

				if (opcao3) {
					System.out.println("Entrou na op��o 3");
					
					
				} else {
					System.out.println("N�o entrou na op��o 3");
				}

			} else {
				System.out.println("N�o entrou na op��o 2");

			}
		} else {
			System.out.println("N�o entrou na op��o 1");
		}
	}
}
