package maratona.java.estruturasderepeticao;

public class Aula06EstruturasDeRepetição01 {

	public static void main(String[] args) {
		
		/**
		 * Estrutura de repetição são elas:
		 * While
		 * Do While
		 * For
		 * 
		 */
		
		/**
		 * While Só executa se for verdadeiro
		 */
		
		int count = 0;
		
		while(count < 10) {
			System.out.println(count++);

		}	
		
		
		/**
		 * Do while executa pelo menos 1 vez
		 */
		
		count = 0;
		
		do {
			System.out.println("Executa uma vez" + ++count);
		} while (count < 10);
		
		
		/**
		 * For utilizados para contagem
		 */
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i);
		}
	}

}
