package treino02_2;
public class Compromisso {
	private int dia;
	private float hora;
	public String tiporoupa;
	public String cidade;
	public String bairro;
	public boolean confirmado;
	public void status() {
		System.out.println("Dia marcado: " + this.dia);
		System.out.println("Hora marcada: " + this.hora);
		System.out.println("Tipo de roupa: " + this.tiporoupa);
		System.out.println("Cidade do compromisso: " + this.cidade);
		System.out.println("Bairro do compromisso: " + this.bairro);
	}
	public void marcado() {
		System.out.println("Marcado...");
	}
	public void desmarcado() {
		System.out.println("Desmarcado...");
	}
	public void adiado() {
		System.out.println("Adiado...");
	}
	public void cancelado() {
		System.out.println("Cancelado...");
	}
}
