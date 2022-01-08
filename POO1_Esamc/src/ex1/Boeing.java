package ex1;

public class Boeing {
	public static void main(String[] args) {
		Aviao boeing = new Aviao();
		boeing.ano = 2013;
		boeing.cor = "Azul";
		boeing.envergadura = 34;
		System.out.println("Avião: Boeing");
		System.out.println("Ano: " + boeing.ano);
		System.out.println("Cor: " + boeing.cor);
		System.out.println("envergadura: " + boeing.envergadura + "m");
		boeing.ligar();
		boeing.acelerar();
	}
}
