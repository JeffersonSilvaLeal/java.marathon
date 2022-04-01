package test;

import model.Carro;

public class CarroTest03 {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.nome = "uno";
		carro.modelo = "sedan";
		carro.ano = "2022";
		
		System.out.println("nome: " + carro.nome + " modelo " + carro.modelo + " ano " + carro.ano);
		System.out.println("---------");
		
		Carro carro2 = new Carro();
		carro2.nome = "palio";
		carro2.modelo = "sedan";
		carro2.ano = "2012";
		System.out.println("nome: " + carro2.nome + " modelo " + carro2.modelo + " ano " + carro2.ano);

		System.out.println("---------");
		
		Carro carro3 = new Carro();
		carro3.nome = "Eco-sport";
		carro3.modelo = "hacth";
		carro3.ano = "2015";
		
		System.out.println("nome: " + carro3.nome + " modelo " + carro3.modelo + " ano " + carro3.ano);

		
	}

}
