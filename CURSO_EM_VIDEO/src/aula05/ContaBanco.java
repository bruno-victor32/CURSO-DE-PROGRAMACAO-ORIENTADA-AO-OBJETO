package aula05;
public class ContaBanco {
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
 	//metodos

	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo;  " + this.getTipo());
		System.out.println("Dono:  " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status:" + this.getStatus());
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem saldo");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois não tem debito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar(float v) {
		if(this.getStatus()) {
			//this.saldo = this.saldo + v; Aqui eu estou mexendo diretamente nos atributos
			this.setSaldo(this.getSaldo() + v); //Aqui eu estou trabalhando diretamente com os metodos especiais
			System.out.println("Deposito realizado na conta de" + this.getDono()); 
		} else {
			System.out.println("Inpossivel depositar em uma conta fechada!");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de" + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por" + this.getDono());
		} else {
			System.out.println("Inpossivel pagar uma conta fechada!");
		}
	}
	//Metodos especiais
	public ContaBanco () {
		this.saldo= 0;
		this.status= false;		
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipo(String setTipo) {
		this.tipo = setTipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String setDono) {
		this.dono = setDono;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(float setSaldo) {
		this.saldo = setSaldo;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean setStatus) {
		this.status = setStatus;
	}
	public boolean getStatus() {
		return this.status;
	}
}
