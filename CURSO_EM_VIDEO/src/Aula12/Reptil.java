package Aula12;
public class Reptil extends Animal {
	private String corEscama;
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de R�ptil");
	}
	
	public String getcorEscama() {
		return corEscama;
	}
	public void setcorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
