package ex1;

public class Brasilia {

	public static void main(String[] args) {
		Carro brasilia = new Carro();
		brasilia.ano = 1974;
		brasilia.cor = "Amarelo";
		System.out.println("Carro: Brasilia" );
		System.out.println("Ano:" + brasilia.ano);
		System.out.println("Cor: " + brasilia.cor);
		brasilia.ligar();
		brasilia.acelerar();

	}

}
