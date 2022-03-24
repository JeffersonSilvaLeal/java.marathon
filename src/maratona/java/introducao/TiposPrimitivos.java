package maratona.java.introducao;

public class TiposPrimitivos {

	public static void main(String[] args) {

		/**
		 * Existe 8 Tipos primitivos no java int , double, float, char, byte, short,
		 * long, boolean
		 * 
		 * O tipo de casting explícito, ocorre em tempo de execução,
		 * diferente do casting implícito, que é interpretado em tempo de compilação.
		 */

		int idade = (int) 1000000000L;
		long numeroGrande = 100000;
		double salarioDouble =(long) 2000.53;
		float salarioFloat = (float)2500.00D;
		byte idadeByte = 10;
		short ano = 2012;
		boolean ativo = true;
		char sexo = 'M';

		
		System.out.println("Tipos de dados em Java: \n" +
	            "\nMenor Byte: " + Byte.MIN_VALUE +
	            "\nMaior Byte: " + Byte.MAX_VALUE +
	            "\nMenor Short: " + Short.MIN_VALUE +
	            "\nMaior Short: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long:" + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE);
	}

}
