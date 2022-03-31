package maratona.java.arrays;

import java.util.Iterator;

public class Aula07Arrays02 {

	public static void main(String[] args) {

		/**
		 * Desclaração de arrys
		 * byte, short, int, float e double  = 0
		 * char = '\0000'  ' '
		 * boolean = false
		 * String =  null
		 */
		
		System.out.println("Arrays de byte");
		byte[] idades = new byte[3];
		idades[0] = 1;
		idades[1] = 2;
		idades[2] = 3;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		System.out.println("----------------");
		
		System.out.println("Array de char");
		char[] dias = new char[3];
		dias[0] = 2;
		dias[1] = 3;
		dias[2] = 4;
		
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		System.out.println("------------------");
		
		System.out.println("Array de boolean");
		boolean[] verdadeiraFalso = new boolean[3];
		verdadeiraFalso[0] = true;
		verdadeiraFalso[1] = false;
		verdadeiraFalso[2] = true;
		
		for (int i = 0; i < verdadeiraFalso.length; i++) {
			System.out.println(verdadeiraFalso[i]);
		}
		System.out.println("---------------------------");
		
		System.out.println("Array de String");
		String[] nomes = new String[3];
		nomes[0] = "Jefferson";
		nomes[1] = "Patricia";
		nomes[2] = "Arthur";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		
	}

}
