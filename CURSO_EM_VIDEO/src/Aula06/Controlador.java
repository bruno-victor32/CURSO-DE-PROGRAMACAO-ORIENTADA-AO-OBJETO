// Interface
package Aula06;
public interface Controlador {
	//Metodos abstratos
	public abstract void ligar();//Aqui nem sempre e void ele pode colocar aqui o tipo de retorno, si ele retorna
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
}
