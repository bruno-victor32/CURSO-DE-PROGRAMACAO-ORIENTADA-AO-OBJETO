package Aula12;
public class Peixe extends Animal {
	private String corEscama;
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}
	@Override
	public void emitirSom() {
		System.out.println("Soltou uma bolha");
	}
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
	public String getcorEscama() {
		return corEscama;
	}
	public void setcorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
