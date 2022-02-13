package primeiro.projeto;

public class UsandoWhile {

	public static void main(String[] args) {
 
		int numero1 = 10;
		int numero2 = 20;
		
		while (numero1 < numero2) {
			
			
			System.out.println("Entrei no While, o número 1 vale: "+ numero1);
			
			numero1 += 1;
			
			
			//numero1 = numero1 + 2;	
			
		}
		
		System.out.println("Sai do While, o número1 vale:" + numero1);

	}

}
