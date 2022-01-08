package ex1;

public class Chevetao {

	public static void main(String[] args) {
		Carro Chevetao = new Carro();
		Chevetao.ano = 1982;
		Chevetao.cor = "Vermelho";
		System.out.println("Carro: Chevetao");
		System.out.println("Ano:"+ Chevetao.ano);
		System.out.println("Cor:"+ Chevetao.cor);
		
		Chevetao.ligar();
		Chevetao.acelerar();
		Chevetao.desligar();

	}

}
