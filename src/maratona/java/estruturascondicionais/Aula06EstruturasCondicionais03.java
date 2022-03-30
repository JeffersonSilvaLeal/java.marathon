package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais03 {

	public static void main(String[] args) {
		
		// Doar se s�lirio for maior que 5000 R$
		double salario = 6000;
		String mensagemDoar = "EU vou doar 500 para institui��o de caridade";
		String mensagemNaoDoar = "Ainda n�o tenho condi��es";
		String resultado;
		
		if(salario > 5000) {
			resultado = mensagemDoar;
		}else {
			resultado = mensagemNaoDoar;
		}
		
		System.out.println(resultado);
		
		/**
		 * Operador Tern�rio
		 * (condicao) ? verdadeiro : falso
		 */
		
		System.out.println("----------------------------------------------");
		String resultado2 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
		System.out.println(resultado2);
		
		System.out.println("-----------------------------------------------");
		String resultado3 = salario > 5000 ? "EU vou doar 500 para institui��o de caridade" : "Ainda n�o tenho condi��es";
		System.out.println(resultado3);
	}

}
