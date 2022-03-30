package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais {

	public static void main(String[] args) {

		/**
		 * 
		 * If só executa se a linha de código for verdadeira
		 */
		
		int menorIdade = 17;
		if(menorIdade < 18) {
			System.out.println("Menor de idade");
		}
		
		int idade = 18;
		boolean isMaiorDeIdade = idade >= 18;
		
		if(isMaiorDeIdade) {
			System.out.println("Maior de idade");
		}
		
		boolean isAutorizado = true;
		
		if(!isAutorizado) {
			System.out.println("Não está autorizado");
		}
		
	}

}
