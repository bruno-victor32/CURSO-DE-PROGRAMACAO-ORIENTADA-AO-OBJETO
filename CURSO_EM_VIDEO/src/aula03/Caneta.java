package aula03;
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status() {
		System.out.println("Uma caneta " + this.cor );
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("esta tampada? " + this.tampada);
		System.out.println("Modelo:" + this.modelo); 
	}
	public void rabiscar () {
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}