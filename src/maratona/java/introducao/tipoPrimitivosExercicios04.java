package maratona.java.introducao;

/**
 * @author jefferson.leal
 *	
 *	Pr�tica
 *	Crie vari�veis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 *	Eu <nome>, estou morando no endere�o <endere�o>,
 *  confirmo que recebi o sal�rio de <sal�rio>, na <data>.
 */
public class tipoPrimitivosExercicios04 {

	public static void main(String[] args) {
		
		String nome = "Jefferson";
		String endereco = "R: Barbalho bezerra n 280";
		double salario = 1500.00;
		String dataRecebimento = "10/03/2002";
		
		String mensagem = "Eu " + nome + ", morando no endere�o " + endereco +	
				" confirmo que recebi o sal�rio de R$:" + salario + " Reais " + " na data " + dataRecebimento;
		
	
		System.out.println(mensagem);
	}

}
