package maratona.java.introducao;

public class Aula05Operadores {

	public static void main(String[] args) {
		/**
		 * Operadores b�sicos
		 * + soma
		 * - subtra��o
		 ** /divis�o
		 * * multiplica��o
		 */
		
		System.out.println("Operadores b�sico");
		int numero01 = 10;
		int numero02 = 20;
		
		int soma = numero01 + numero02;
		int subtracao = numero01 - numero02;
		int divisao = numero01 / numero02;
		int multiplicacao = numero01 + numero02;
		
		System.out.println("Resultado �: " + soma);
		System.out.println("Resultado e: " + subtracao);
		System.out.println("Resultado �: " + divisao);
		System.out.println("Resultado �: " + multiplicacao);
		
		System.out.println("------------------------------");
		System.out.println("Operadores l�gicos");
		/*
		 * % Operador Resto
		 * 
		 */
		
		int resto = 20 % 2;
		System.out.println("O Resto da divis�o �: " + resto);
		/**
		 * Operador l�gico sempre retorna n�mero booleano
		 * < menor
		 * > maior
		 * <= menor igual
		 * >= maior igual
		 * == igualdade
		 * != diferente
		 */	
		
		boolean isDezMaiorQueVinte = 10 > 20;
		System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
		
		boolean isDezMenorQueVinte = 10 < 20;
		System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
		
		boolean isDezMenorIgualVinte = 10 <= 20;
		System.out.println("isDezMenorIgualVinte " + isDezMenorIgualVinte);
		
		boolean isDezMaiorIgualVinte = 10 >= 20;
		System.out.println("isDezMaiorIgualVinte " + isDezMaiorIgualVinte);
		
		boolean isDezIgualVinte = 10 == 20;
		System.out.println("isDezIgualVinte " + isDezIgualVinte);
		
		boolean isDezDiferentevinte = 10 != 20;
		System.out.println("isDezDiferentevinte " + isDezDiferentevinte);
	}
}
