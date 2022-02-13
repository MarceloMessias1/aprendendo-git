package primeiro.projeto;

public class ExecutaMetodo {

	public static void main(String[] args) {

		// MetodoVazio metodo = new MetodoVazio();

		MetodoRetorno retorno = new MetodoRetorno();
		MetodoAtributo atributo = new MetodoAtributo();
		

		// metodo.mensagem();

//System.out.println("O nome retornado pelo método é "+retorno.nome());

		//atributo.digiteSeuNome("Marcelo");
		//atributo.digiteSuaIdade(39);
		
		atributo.informeDados(39 , "Marcelo");
		atributo.consultaDados();
	}

}
