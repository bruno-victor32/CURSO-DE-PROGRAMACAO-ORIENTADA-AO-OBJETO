package Previa;

public class Otis extends Elevador {

	public static void main(String[] args) {
		Elevador l4 = new Elevador();
		l4.modelo = "Elevador de Carro";
		l4.cor = "Azul escuro";
		l4.ano = 2017;
		l4.capacidade = 3000;
		System.out.println("Elevador: Otis" );
		System.out.println("Modelo:" + l4.modelo);
		System.out.println("Cor: " + l4.cor);
		System.out.println("Ano: " + l4.ano);
		System.out.println("Capacidade em KG:" + l4.capacidade);
		System.out.println("--------------------------------" );
		l4.ligar();
		l4.subir();
		l4.descer();
		l4.parar();
		l4.desligar();

	}

}
