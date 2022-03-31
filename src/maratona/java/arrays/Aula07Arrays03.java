package maratona.java.arrays;

public class Aula07Arrays03 {

	public static void main(String[] args) {

		/**
		 * Formas diferentes para se inicializar um array
		 */
		int[] numeros = new int[3];
		int[] numeros2 = {1,2,3,4,5};
		int[] numeros3 = new int[]{1,2,3,4,5};
		
		System.out.println("For indexado");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("---------------------");
		
		System.out.println("ForEach versão simplificada do For");
		
		for (int i : numeros2) {
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		
		
	}

}
