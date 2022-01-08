//Classe principal
package aula09;
public class ProjetoLivro {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2]; //Criando um vetor de pessoa
		Livro[]  l = new Livro[3]; //Criando um vetor de Livro
		
		p[0] = new Pessoa("Pedro" , 22, "M"); //Primeira Pessoa
		p[1] = new Pessoa("Maria" , 25, "F"); //Segunda Pessoa
		
		l[0] = new Livro ("Aprendendo Java", "Jose da Silva", 300, p[0]);// Dono do livro e o P[0] ou seja e o Pedro
		l[1] = new Livro ("POO para Iniciantes", "Pedro Paulo", 500, p[1]);// Dono do livro e o P[1] ou seja e o Maria
		l[2] = new Livro ("Java Avançado", "Maria Candido" , 800, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(400);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
		l[1].abrir();
		l[1].folhear(100);
		l[1].avancarPag();
		System.out.println(l[1].detalhes());

	}

}
