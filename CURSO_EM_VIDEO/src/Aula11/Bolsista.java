package Aula11;
public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	@Override
	public void PagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado");
	}
	
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	public float getBolsa() {
		return bolsa;
	}
}
