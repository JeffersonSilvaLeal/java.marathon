package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionaisSwitchExercicio07 {

	public static void main(String[] args) {
		
	
	/**
	 * Utilizando Switch
	 * Dados os valores de 1 a 7, imprima se � dia �til ou final de semana
	 * Considerando 1 como domingo
	 */
	
	byte dia = 7;
	
	switch(dia){
	case 1:
		System.out.println("Fds");
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		System.out.println("Dia �til");
		break;
	case 7:
		System.out.println("Fds");
		break;
	default:
		System.out.println("Op��o inv�lida");
		
	}
	
	}
}
