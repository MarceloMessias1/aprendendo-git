package primeiro.projeto;

public class RevisandoIf {

	public static void main(String[] args) {

		int mediaPassar = 9;
		int nota1 = 10;
		int nota2 = 0;
		int nota3 = 8;
		int media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= mediaPassar) {
			System.out.println("Parab�ns voce passou de ano ficando com m�dia de " +media+".");
		
		}else {
			System.out.println("Infelizmente voc� n�o atingiu a m�dia ficando apenas com " +media+".");


		}
		

	}

}
