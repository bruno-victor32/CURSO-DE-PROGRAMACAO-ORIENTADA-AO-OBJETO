package ex2;

public class Automovel {
	public int ano;
	public String cor;
	private String marca;
	protected String combustivel;
	protected int tanque;
	
	public void ligar () {
		System.out.println("Ligado");
	}
	protected void desligar () {
		System.out.println("Desligado");
	}
	protected void acelerar() {
		System.out.println("Acelerando");

	}
}