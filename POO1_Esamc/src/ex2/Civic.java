package ex2;

public class Civic {
	public static void main(String[] args) {
		Automovel civic = new Automovel();
		civic.cor = "Preto";
		civic.ano = 2021;
		civic.combustivel = "Flex";
		civic.tanque = 200;
		
		System.out.println("Carro:Civic" );
		System.out.println("Ano: "  + civic.ano);
		System.out.println("Cor: "  + civic.cor);
		System.out.println("Combustivel: "  + civic.combustivel);
		System.out.println("Quantidade Tanque: "  + civic.tanque + " litros");
		
		civic.ligar();
		civic.acelerar();
		civic.desligar();
	}
}
