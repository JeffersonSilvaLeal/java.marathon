package maratona.java.estruturasderepeticao;

public class Aula06EstruturasDeRepeti��o03 {

	public static void main(String[] args) {

		/*
		 * Imprima os primeiros 25 n�meros de um dado valor.
		 */
		
		int valorMax = 50;
		for(int i = 0; i <= valorMax ; i++) {
			
			if (i > 25) {
				break;
			}
				System.out.println(i);		
		}
	}

}
