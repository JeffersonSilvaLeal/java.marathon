package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais05 {

	public static void main(String[] args) {
		
		double sal�rioAnual = 70000;
		double primeiraFaixa = 9.70 / 100;// porcentagem
		double segundaFaixa = 37.35 / 100;// porcentagem
		double terceiraFaixa = 49.50 / 100;// porcentagem
		double valorImposto;
		
		if(sal�rioAnual <= 34712) {
			valorImposto = sal�rioAnual * primeiraFaixa;
		}else if(sal�rioAnual >= 34713 && sal�rioAnual <= 68507) {
			valorImposto = sal�rioAnual * segundaFaixa;
		}else {
			valorImposto = sal�rioAnual * terceiraFaixa;
		}
		
		System.out.println("Imposto anual � : " + valorImposto);
	}

}
