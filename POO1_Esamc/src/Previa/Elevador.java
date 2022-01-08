package Previa;

public class Elevador {
	String modelo;
	String cor;
	int capacidade;
	int ano;
	
	void ligar() {
		System.out.println("Elevador Ligado...");
	}
	
	void desligar() {
		System.out.println("Elevador Desligado...");
	}
	
	void subir() {
		System.out.println("Elevador Subindo...");
	}
	
	void descer() {
		System.out.println("Elevador Descendo...");
	}
	
	void parar() {
		System.out.println("Elevador Parado...");
	}
}
