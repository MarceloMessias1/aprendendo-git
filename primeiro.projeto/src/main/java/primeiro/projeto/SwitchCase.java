package primeiro.projeto;

public class SwitchCase {

	public static void main(String[] args) {
// 1 Vista | 2 Credito | 3 Boleto
		
		
		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 10.000;
		

		switch (opcao) {

		case 1:
			System.out.println("Você escolheu a opção Vista");
			if (saldoCliente >= valorProduto) {
				
				System.out.println("Compra realizada com sucesso");
			}else {
				
				System.out.println("Compra negada, procure o seu banco.");
			}
			
			break;
			
		case 2:
			System.out.println("Você escolheu a opção Crédito");
			
			if (saldoCliente >= valorProduto) {
				
			}else {
				System.out.println(" Compra negada, procure o seu banco.");
			}
			break;
			
		case 3:
			System.out.println("Você escolheu a opção Boleto");
			
			break;
			
			default:
				System.out.println("Opção inválida");
		
		
		}

	}

}
