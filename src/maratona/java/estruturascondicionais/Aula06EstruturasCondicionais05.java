package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais05 {

	public static void main(String[] args) {
		
		double salárioAnual = 70000;
		double primeiraFaixa = 9.70 / 100;// porcentagem
		double segundaFaixa = 37.35 / 100;// porcentagem
		double terceiraFaixa = 49.50 / 100;// porcentagem
		double valorImposto;
		
		if(salárioAnual <= 34712) {
			valorImposto = salárioAnual * primeiraFaixa;
		}else if(salárioAnual >= 34713 && salárioAnual <= 68507) {
			valorImposto = salárioAnual * segundaFaixa;
		}else {
			valorImposto = salárioAnual * terceiraFaixa;
		}
		
		System.out.println("Imposto anual é : " + valorImposto);
	}

}
