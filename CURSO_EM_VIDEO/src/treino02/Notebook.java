package treino02;
public class Notebook {
	String marca;
	String cor;
	String processador;
	int ram;
	boolean tampada;
	void status() {
		System.out.println("Um notebook " + this.cor);
		System.out.println("Processador: " + this.processador);
		System.out.println("Ram: "  + this.ram);
		System.out.println("Esta fechado? " + this.tampada);
		System.out.println("Marca " + this.marca);
	}
	void funcionando() {
		if(this.tampada == true) {
			System.out.println("ERRO!N�o e possivel ligar");
		}else {
			System.out.println("Est� Ligado");
		}
	}
	void abertoo() {
		this.tampada = true;
	}
	void fechadoo() {
		this.tampada = false;
	}
}
