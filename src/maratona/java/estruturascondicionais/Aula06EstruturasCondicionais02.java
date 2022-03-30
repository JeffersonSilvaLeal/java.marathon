package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais02 {

	public static void main(String[] args) {

		/**
		 * idade < 15 categoria infantil
		 * idade >= 15 && idade < 18 categoria junvenil
		 * idade >= 18 cateria adulto
		 */
		
		int idade = 20;
		String categoria;
		
		if(idade < 15 ) {
			categoria = "Infantil";
		}else if(idade >= 15 && idade < 18) {
			categoria = "Juvenil";
		}else {
			categoria = "Adulto";
		}
		
		System.out.println(categoria);
	}

}
