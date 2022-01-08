package Aula12;
public class Ave extends Animal {
	private String corPena;
	@Override
	public void locomover() {
		System.out.println("voando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo Fruta");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
	
	public String getcorPena() {
		return corPena;
	}
	
	public void setcorPena(String corPena) {
		this.corPena = corPena;
	}
}
