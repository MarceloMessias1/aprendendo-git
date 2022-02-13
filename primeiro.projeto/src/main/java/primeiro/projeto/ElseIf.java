package primeiro.projeto;

public class ElseIf {

	public static void main(String[] args) {

		boolean dinheiro = true;
		boolean credito = false;
		boolean boleto = false;
		int preco = 10000;

		System.out.println("********************************************");
		System.out.println("************* E2E Treinamentos *************");
		System.out.println("********************************************");
		System.out.println("");

		if (dinheiro) {
			int desconto = 600;
			preco -= desconto;

			System.out.println("Parabéns pela compra do carro no valor R$ " + preco);

		} else  if (credito){
			int juros = 1500;
			preco = preco + juros;

			System.out.println("Parabéns pela compra do carro no valor R$ " + preco);
		}else if (boleto) {
			
			int juros = 3000;
			preco = preco + juros;
			
			System.out.println("Parabéns pela compra do carro no valor R$ " + preco);
		}else {
			
			System.out.println("Opção de pagamento não disponível.");

		}
	}

}
