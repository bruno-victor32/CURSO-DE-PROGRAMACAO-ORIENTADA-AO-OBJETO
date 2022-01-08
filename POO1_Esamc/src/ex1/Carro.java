//Classe Modelo
package ex1;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	public Carro() { //construtor
		Random gerador = new Random(); //classe Random
		int chassi = gerador.nextInt(500); //gerador de numeros aleatorios
		
		System.out.println("Chassi: " + chassi );
	}
	
	public Carro(int ano, String cor) { //Construtor com parametro
		this.ano = ano;
		this.cor = cor;
	}
	
	void ligar() {
		System.out.println("Ligado...");
	}
	
	void desligar() {
		System.out.println("Desligado...");
	}
	
	void acelerar() {
		System.out.println("Acelerando...");
	}

}
