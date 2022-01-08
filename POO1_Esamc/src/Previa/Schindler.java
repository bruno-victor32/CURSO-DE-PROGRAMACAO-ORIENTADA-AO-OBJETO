package Previa;

public class Schindler {

	public static void main(String[] args) {
		Elevador l2 = new Elevador();
		l2.modelo = "Unifamiliares";
		l2.cor = "Preto";
		l2.ano = 2015;
		System.out.println("Elevador: Schindler" );
		System.out.println("Modelo:" + l2.modelo);
		System.out.println("Cor: " + l2.cor);
		System.out.println("Ano: " + l2.ano);
		System.out.println("--------------------------------" );
		l2.ligar();
		l2.subir();
		l2.descer();
		l2.desligar();

	}

}
