package maratona.java.estruturasderepeticao;

public class Aula06EstruturasDeRepetição04 {

	public static void main(String[] args) {
		
		/**
		 * Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado!
		 * Condição valorParcela >= 1000
		 */
		
		double valorTota = 30000;
		
		for (int parcela = 1; parcela <= valorTota; parcela++) {
			double valorParcela = valorTota / parcela;
			
			if(valorParcela < 1000) {
				break;
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);
		}
	}

}
