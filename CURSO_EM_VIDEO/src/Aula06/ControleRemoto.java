package Aula06;
public class ControleRemoto implements Controlador { //Quando eu coloquei "implements Controlador" que dizer que minha classe implementa uma determinada interface, como definimos uma interface com seus metodos abstratos na hora que eu coloco "implements Controlador" ele vai dizer que precisa fazer todos metodos 
	//Atributo
	private int volume;
	private boolean ligado;
	private boolean tocando;
	//Metodos especiais
	public ControleRemoto() { //Metodo construtor
		this.volume = 50;//O volume vai começar com 50
		this.ligado = true;
		this.tocando = false;
	}
	private int getVolume() {
		return volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	//Metodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}
	@Override
	public void desligar() {
		this.setLigado(false);
	}
	@Override //@Override significa sobreescrever,significa que eu já tinha um metodo definido que e um metodo abstrato e agora eu estou desconsiderando aquela programação que não inha sido feita e agora vou programar cada um deles
	public void abrirMenu() {
		System.out.println("----------MENU------------------");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Esta tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.println("");
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}
	@Override
	public void maisVolume() {
		if (this.getLigado()) { //Só vai aumentar o volume si a tv estiver ligada
			this.setVolume(this.getVolume() + 5);//vamos aumentar o volume de 5 em 5
		}else {
			System.out.println("Impossivel aumentar volume");
		}
	}
	@Override
	public void menosVolume() {
		if (this.getLigado()) {//Só vai abaixar o volume si a tv estiver ligada
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossivel diminuir volume");
		}
	}
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {//A tv só vai permite deixar mudo si a tv estiver ligada e o volume estiver acima de 0
			this.setVolume(0);
		}
	}
	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {//Si a tv estiver ligada e não estiver tocando eu posso apertar play
			this.setTocando(true);
		}else {
			System.out.println("Não consegui reproduzir");
		}
	}
	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não conseguir pausar");
		}
	}
}	

//Quando eu coloco os getters e setters como privado eu não posso usar nem o get e nem o set  fora da classe
