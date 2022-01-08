package Previa;

public class Villarta extends Elevador {

	public static void main(String[] args) {
		Elevador l3 = new Elevador();
		l3.modelo = "Social de Luxo";
		l3.cor = "Verde";
		l3.ano = 2019;
		l3.capacidade = 600;
		System.out.println("Elevador: Villarta" );
		System.out.println("Modelo:" + l3.modelo);
		System.out.println("Cor: " + l3.cor);
		System.out.println("Ano: " + l3.ano);
		System.out.println("Capacidade em KG:" + l3.capacidade);
		System.out.println("--------------------------------" );
		l3.ligar();
		l3.subir();
		l3.descer();
		l3.desligar();

	}

}
