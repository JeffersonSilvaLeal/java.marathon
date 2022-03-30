package maratona.java.introducao;

public class Aula05Operadores {

	public static void main(String[] args) {
		/**
		 * Operadores básicos
		 * + soma
		 * - subtração
		 ** /divisão
		 * * multiplicação
		 */
		
		System.out.println("Operadores básico");
		int numero01 = 10;
		int numero02 = 20;
		
		int soma = numero01 + numero02;
		int subtracao = numero01 - numero02;
		int divisao = numero01 / numero02;
		int multiplicacao = numero01 + numero02;
		
		System.out.println("Resultado é: " + soma);
		System.out.println("Resultado e: " + subtracao);
		System.out.println("Resultado é: " + divisao);
		System.out.println("Resultado é: " + multiplicacao);
		
		System.out.println("------------------------------");
		System.out.println("Operadores Relacionais");
		/*
		 * % Operador Resto
		 * 
		 */
		
		int resto = 20 % 2;
		System.out.println("O Resto da divisão é: " + resto);
		/**
		 * Operador lógico sempre retorna número booleano
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
		
		System.out.println("------------------------------------------");
		System.out.println("Operadores Lógicos");
		
		/**
		 * Operadores lógicos Introdução
		 * && (And) 
		 * || (or )
		 * !  (not)
		 */
	
		System.out.println("Operador &&");
		int idade = 19;
		double salario = 4500;
		
		boolean isMaiorDeIdade = idade >= 18 && salario >= 4000;
		boolean IsMenorDeIdade = idade <= 18 && salario >= 3000; 
		System.out.println("isMaiorDeIdade " + isMaiorDeIdade);
		System.out.println("IsMenorDeIdade " + IsMenorDeIdade);
		
		System.out.println("Operador ||");
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupança = 10000;
		float valorPlaytation = 5000;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaytation || valorTotalContaPoupança > valorPlaytation;
		System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
		
		
		/**
		 * Operadores de atribuição
		 * = igual
		 * += mais igual
		 * -= menos igual
		 * *= multiplicaar igual
		 * /= divisão igual
		 * %= resto igual
		 */
		
		System.out.println("------------------------");
		System.out.println("Operadores de atribuição");
		double bonus = 1000;
		bonus += 1000;
		bonus -= 1000;
		bonus *= 2;
		bonus /= 2;
		bonus %= 2;

		System.out.println(bonus);
		
		System.out.println("---------------");
		System.out.println("Operador unário");
		/**
		 * Operadores unários
		 */
		int contador = 0;
		/**
		 * Incrementa depois da váriavel
		 */
		contador += 1;
		contador ++;
		
		/**
		 * incrementa antes da váriavel
		 */
		contador --;
		++contador;
		--contador;
		System.out.println(contador);
	}
}
