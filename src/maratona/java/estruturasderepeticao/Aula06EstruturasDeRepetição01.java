package maratona.java.estruturasderepeticao;

public class Aula06EstruturasDeRepeti��o01 {

	public static void main(String[] args) {
		
		/**
		 * Estrutura de repeti��o s�o elas:
		 * While
		 * Do While
		 * For
		 * 
		 */
		
		/**
		 * While S� executa se for verdadeiro
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
