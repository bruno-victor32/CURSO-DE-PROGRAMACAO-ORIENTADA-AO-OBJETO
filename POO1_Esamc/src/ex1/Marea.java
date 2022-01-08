package ex1;

public class Marea {

	public static void main(String[] args) {//aqui passei parametros
		Carro marea = new Carro(1998, "Musgo");
		System.out.println("Carro: Marea" );
		System.out.println("Ano: " + marea.ano);
		System.out.println("Cor: " + marea.cor);
		marea.desligar();

	}

}
