package Aula06;
public class Aula06 {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		//c.ligar();
		c.maisVolume();
		//c.ligarMudo();
		c.play();
		c.abrirMenu();
		c.fecharMenu();
		//c.volume = 80; Desse forma  ele vai dar erro devido esta como privado, esta como encapsulado.N�o e possivel nem dar setVolume
		

	}

}

//Aqui eu n�o vou poder usar nenhum get e setter somente os metodos que est�o disponiveis na interface