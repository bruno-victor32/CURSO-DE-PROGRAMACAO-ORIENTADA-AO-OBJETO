package Aulaconta;

public class AulaConta {
	public static void main(String[] args) {
		Aulateste p1 = new Aulateste();
		p1.setNumConta(1111); //Numero da conta
		p1.setDono("Bruno"); //Dono da conta
		p1.abrirConta("CC"); //Tipo de conta
		p1.sacar(10000);

		
		
		Aulateste p2 = new Aulateste();
		p2.setNumConta(2222); //Numero da conta
		p2.setDono("Gracineide"); //Dono da conta
		p2.abrirConta("CP"); //Tipo de conta
		p2.depositar(900); //depositar dinheiro da conta
		p2.sacar(1000); //sacar dinheiro da conta
		p2.fecharConta(); //Fechando a conta
		
		

		p1.estadoAtual();	//Estado atual da conta
		p2.estadoAtual();	//Estado atual da conta
		

	}

}
