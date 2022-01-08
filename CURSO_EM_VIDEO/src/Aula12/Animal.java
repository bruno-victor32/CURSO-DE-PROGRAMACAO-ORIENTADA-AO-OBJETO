package Aula12;
public abstract class Animal {
	// Atributos de Animal
	protected float peso;
	protected int idade;
	protected int membros;
	
	//Metodos de Animal que s�o metodos abstratos que somente as filhas s�o obrigadas a desenvolver
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
}
