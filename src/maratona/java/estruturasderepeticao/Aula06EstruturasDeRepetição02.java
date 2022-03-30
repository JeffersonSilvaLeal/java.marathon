package maratona.java.estruturasderepeticao;

public class Aula06EstruturasDeRepetição02 {

	public static void main(String[] args) {


		/*
		 * imprima todos os números pares de 0 até 10000
		 */
		
		for (int i= 0; i <= 10000; i++) {
			// Par
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i= 0; i <= 10000; i++) {
			// Impar
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
