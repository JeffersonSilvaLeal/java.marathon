package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais01 {

	public static void main(String[] args) {

		/**
		 * 
		 * If s� executa se a linha de c�digo for verdadeira
		 * Else s� executa se a linha for falsa
		 */
		
		int menorIdade = 17;
		
		if(menorIdade < 18) {
			System.out.println("Menor de idade");
		}else {
			System.out.println("Maior de idade");
		}
		
		int idade = 18;
		
		boolean isMaiorDeIdade = idade >= 18;
		
		if(isMaiorDeIdade) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		boolean isAutorizado = true;
		
		if(!isAutorizado) {
			System.out.println("Est� autorizado");
		}else {
			System.out.println("N�o est� autorizado");
		}
		
	}

}
