package treino02;
public class treino02 {
	public static void main(String[] args) {
		Notebook n1 = new Notebook();
		n1.cor = "black";
		n1.marca = "acer";
		n1.processador = "I5";
		n1.ram = 8;
		n1.fechadoo();
		n1.status();
		n1.funcionando();
		
		Notebook n2 = new Notebook();
		n2.cor = "red";
		n2.marca = "avell";
		n2.processador = "I7";
		n2.ram = 16;
		n2.abertoo();
		n2.status();
		n2.funcionando();
	}
}
