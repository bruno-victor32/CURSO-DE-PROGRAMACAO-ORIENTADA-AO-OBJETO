package ex1;

public class Porshe {
	public static void main(String[] args) {
		Carro Porshe = new Carro();
		Porshe.ano = 2018;
		Porshe.cor = "Preto";
		System.out.println("Carro: Porshe");
		System.out.println("Ano:"+ Porshe.ano);
		System.out.println("Cor:"+ Porshe.cor);
		
		Porshe.ligar();
		Porshe.acelerar();
	}

}
