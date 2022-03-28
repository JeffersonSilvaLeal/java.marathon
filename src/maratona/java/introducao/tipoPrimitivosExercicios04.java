package maratona.java.introducao;

/**
 * @author jefferson.leal
 *	
 *	Prática
 *	Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 *	Eu <nome>, estou morando no endereço <endereço>,
 *  confirmo que recebi o salário de <salário>, na <data>.
 */
public class tipoPrimitivosExercicios04 {

	public static void main(String[] args) {
		
		String nome = "Jefferson";
		String endereco = "R: Barbalho bezerra n 280";
		double salario = 1500.00;
		String dataRecebimento = "10/03/2002";
		
		String mensagem = "Eu " + nome + ", morando no endereço " + endereco +	
				" confirmo que recebi o salário de R$:" + salario + " Reais " + " na data " + dataRecebimento;
		
	
		System.out.println(mensagem);
	}

}
