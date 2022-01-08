package Aulaconta;

public class Aulateste {
	
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//metodos personalizados
	
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo:  " + this.getTipo());
		System.out.println("Dono:  " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		this.status=true;
		if (t == "CC") { 
			this.setSaldo(500);
		} else if (t=="CP") {
			this.setSaldo(100);
		}
		System.out.println("Conta aberta com sucesso");
		
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser encerrada,pois ainda tem saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser encerrada,pois possui débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso!");
		}
		
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito efetuado com sucesso na conta de " +this.getDono());
		} else {
			System.out.println("Impossível realizar depósito em conta encerrada!");
		}
		
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if(this.getSaldo() >=v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível realizar saque em conta encerrada");
		}
		
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v=12;
		}else if (this.getTipo() == "CP") {
			v=20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " +this.getDono());
		}else {
			System.out.println("Impossível pagar mensalidade de uma conta encerrada!");
		}
	}
	
	//metodo especiais (construtor)
	public Aulateste() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return dono;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus () {
		return status;
	}
	
}
