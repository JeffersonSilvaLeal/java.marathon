package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais03 {

	public static void main(String[] args) {
		
		// Doar se sálirio for maior que 5000 R$
		double salario = 6000;
		String mensagemDoar = "EU vou doar 500 para instituição de caridade";
		String mensagemNaoDoar = "Ainda não tenho condições";
		String resultado;
		
		if(salario > 5000) {
			resultado = mensagemDoar;
		}else {
			resultado = mensagemNaoDoar;
		}
		
		System.out.println(resultado);
		
		/**
		 * Operador Ternário
		 * (condicao) ? verdadeiro : falso
		 */
		
		System.out.println("----------------------------------------------");
		String resultado2 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
		System.out.println(resultado2);
		
		System.out.println("-----------------------------------------------");
		String resultado3 = salario > 5000 ? "EU vou doar 500 para instituição de caridade" : "Ainda não tenho condições";
		System.out.println(resultado3);
	}

}
