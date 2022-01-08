package Aula12;
public class Canguru extends Mamifero {
	@Override //sobrepor o nosso metodo locomover
	public void locomover() {
		System.out.println("Saltando");
	}
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
}
