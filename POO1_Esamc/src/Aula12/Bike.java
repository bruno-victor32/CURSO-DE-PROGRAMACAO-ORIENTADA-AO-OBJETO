package Aula12;

public class Bike extends Moto{

	public void Som() {
		System.out.println("Som da Bicicleta");
	}
	
	public void reagir(String frase) {
		if (frase.equals ("Corre") || frase.equals ("Vai ")) {
			System.out.println("Pedale mais rápido");	
		} else {
			System.out.println("Pedale mais devagar");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Treino Matutino");
		}else if (hora >= 18) {
			System.out.println("Treino Noturno");
		}else {
			System.out.println("Treino Vespertino");
		}
	}

	
}
