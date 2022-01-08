package aula10;
public class Aluno extends Pessoa { //Para fazer que a herança funcione eu faço "extends Pessoa"
	private int matricula;
	private String curso;
	
	public void cancelarMatricula() {
		System.out.println("Matricula será cancelada");
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
}
