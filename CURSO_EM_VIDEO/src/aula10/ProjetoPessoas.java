package aula10;
public class ProjetoPessoas {
	public static void main(String[] args) {
		//Programa Principal
		Pessoa p1 = new Pessoa(); //Objetos
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro"); //Atribuindo nomes
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(25);
		p3.setIdade(55);
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		//p3.receberAumento(550.20f); //Somente p3 pode receber aumento
		//p4.mudaTrabalho();
		//p2.cancelarMatricula();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

	}

}

//Herança e a palavra extends que colocamos depois do nome da classe
// Quem esta antes do extends e a classe filha e quem está depois
//do extends e a classe mãe

//Toda subclasse herda todos os seus conteudos das suas ancestrais
//Toda subclasse herda tudo que sua superclasse tem, mesmo que não esteja totalmente disponivel ela tem 