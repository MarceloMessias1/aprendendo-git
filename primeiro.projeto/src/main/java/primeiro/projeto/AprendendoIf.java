package primeiro.projeto;

public class AprendendoIf {

	public static void main(String[] args) {

		int idadePermitida = 18;
		int minhaIdade = 39;

		if (minhaIdade >= idadePermitida) {
			System.out.println("Permitido tirar habilita��o, a sua idade � " + minhaIdade + ".");
		} else {

			System.out.println("N�o � permitido tirar habilita��o voc� ainda tem apenas " + minhaIdade + ".");

		}
	}

}
