package Previa;

public class Atlas extends Elevador {
	public static void main(String[] args) {
		Elevador l1 = new Elevador();
		l1.modelo = "Carga";
		l1.cor = "Cinza";
		l1.ano = 1996;
		l1.capacidade = 2000;
		System.out.println("Elevador: Atlas" );
		System.out.println("Modelo:" + l1.modelo);
		System.out.println("Cor: " + l1.cor);
		System.out.println("Ano: " + l1.ano);
		System.out.println("Capacidade em KG:" + l1.capacidade);
		System.out.println("--------------------------------" );
		l1.ligar();
		l1.subir();
		l1.desligar();
		

	}

}
