package UltraEmojiCombat;
public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	//Metodos
	public void apresentar() {
		System.out.println("---------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentarmos o lutador" + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura());
		System.out.println("pesando " + this.getPeso() + " kg");
		System.out.println(this.getVitorias() + " vitorias ");
		System.out.println(this.getDerrotas() + " derrotas ");
		System.out.println(this.getEmpates() + " empates! ");
	}
	public void status() {
		System.out.println(this.getNome() + " � um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
		System.out.println();
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		//this.vitorias = this.vitorias + 1; E possivel utilizar dessa forma ou a de cima, e preferivel utilizar a de cima
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1); 
	}
	//Metodos abstratos
	public Lutador(String nome,String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);// Aqui no meu construtor eu n�o posso fazer "this.peso = peso", s� posso fazer utilizando setPeso, quando eu utilizo seetPeso ele vai vim automaticamente no setPeso, vai chamar o setPeso, vai configurar o peso s� que agora ele vai chamar o setCategoria para poder fazer que setCategoria analise o peso dele e veja qual categoria ele pertence
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() { //Categoria n�o ser� utilizada do lado de fora, vai ser simplesmente um metodo interno.Do lado de fora eu n�o posso usar setCategoria porque a categoria muda automaticamente quando eu fa�o a atualiza��o do peso
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "M�dio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria="Invalido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}



}
