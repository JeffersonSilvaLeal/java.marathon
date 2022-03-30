package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionaisSwitch06 {

	public static void main(String[] args) {

		/**
		 * Imprima o dia da semana considerando 1 como domingo
		 */
		
		byte dia = 10;
		
		/**
		 * Valores aceitos no switch
		 * char, in, byte, short, enum, String
		 */
		
		switch(dia) {
		case 1 :
			System.out.println("Domingo");
			break;
		case 2 :
			System.out.println("Segunda");
			break;
		case 3 :
			System.out.println("Terça");
			break;
		case 4 :
			System.out.println("Quarta");
			break;
		case 5 :
			System.out.println("Quinta");
			break;
		case 6 :
			System.out.println("Sexta");
			break;
		case 7 :
			System.out.println("Sabádo");
			break;
		default:
			System.out.println("Não é um dia válido");
			break;
		}
		
		char sexo = 'M';
		switch(sexo) {
		case 'M':
			System.out.println("Masculino");
			break;
		case 'F':
			System.out.println("Feminino");
			break;
		default:
			System.out.println("inválido");
			break;
		}
	}

}
