package Aula11;
public final class Aluno extends Pessoa {
	private int matricula;
	private String curso;

	public  void PagarMensalidade() {
		System.out.println("Pago mensalidade do aluno: " + this.nome);//this.nome eu posso fazer dessa forma devido os atributos da classe pessoa ter os atributos protegidos,porque o acesso protegido da acesso a propria classe e a classe imediatamente inferior, a superclasse
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
