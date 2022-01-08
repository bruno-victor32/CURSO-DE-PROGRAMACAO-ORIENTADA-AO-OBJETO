package treino5A;
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") { 
			this.setSaldo(50);
		} else if (t =="CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta com dinheiro.Não pode ser fechada a conta");
		} else if (saldo < 0) {
			System.out.println("Conta em debito.Não pode ser fechada a conta");
		} else
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
	}
	public void depositar() {
		
	}
	public void sacar() {
		
	}
	public void pagarMensal() {
		
	}
	
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return tipo;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return dono;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setStatus(boolean s) {
		this.status =s;
	}
	public boolean getStatus () {
		return status;
	}
	
}
