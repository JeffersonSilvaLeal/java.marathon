package maratona.java.arrays;

public class Aula07ArraysMultidimensionais01 {

	public static void main(String[] args) {
		
		/**
		 * Arrays multidimencionais nada mais é que array de array
		 */
		
		/**
		 *  1,2,3,4,5,6,7,8,9,10,11,12
		 *  1 - 30 dias
		 * 
		 */
		
		int[][] dias = new int[3][3];
		
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;
	
		dias[1][0] = 31;
		dias[1][1] = 28;
		dias[1][2] = 31;
		

		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}
	
		System.out.println("ForEach");
		for (int[] arrayBase : dias) {
			for (int num : arrayBase) {
				System.out.println(num);
			}
		}
	}

}
