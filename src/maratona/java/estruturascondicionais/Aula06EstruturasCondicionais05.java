package maratona.java.estruturascondicionais;

public class Aula06EstruturasCondicionais05 {

	public static void main(String[] args) {
		
		double salįrioAnual = 70000;
		double primeiraFaixa = 9.70 / 100;// porcentagem
		double segundaFaixa = 37.35 / 100;// porcentagem
		double terceiraFaixa = 49.50 / 100;// porcentagem
		double valorImposto;
		
		if(salįrioAnual <= 34712) {
			valorImposto = salįrioAnual * primeiraFaixa;
		}else if(salįrioAnual >= 34713 && salįrioAnual <= 68507) {
			valorImposto = salįrioAnual * segundaFaixa;
		}else {
			valorImposto = salįrioAnual * terceiraFaixa;
		}
		
		System.out.println("Imposto anual é : " + valorImposto);
	}

}
