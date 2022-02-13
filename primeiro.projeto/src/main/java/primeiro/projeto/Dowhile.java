package primeiro.projeto;

public class Dowhile {

	public static void main(String[] args) {

		int numero1 = 20;
		int numero2 = 20;

		do {

			System.out.println("Entrei no While, o número 1 vale: " + numero1);

			numero1++;

			// numero1 = numero1 + 2;

		} while (numero1 < numero2);

		System.out.println("Fora do While, o número1 vale:" + numero1);

	}

}
