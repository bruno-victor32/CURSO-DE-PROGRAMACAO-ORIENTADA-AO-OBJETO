package treino02_2;
public class Dentista {
	public static void main(String[] args) {
		Compromisso dentista_ = new Compromisso();
		dentista_.bairro = "Gonzaga";
		dentista_.cidade = "Santos";
		//dentista_.dia = 30;
		//dentista_.hora = 15.00f;
		dentista_.tiporoupa = "Normal";
		dentista_.status();
		dentista_.marcado();
		
		Compromisso reuniao = new Compromisso();
		reuniao.bairro = "Aparecida";
		reuniao.cidade = "Santos";
		//reuniao.dia = 29;
		//reuniao.hora = 14.00f;
		reuniao.tiporoupa = "Social";
		reuniao.status();
		reuniao.desmarcado();

	}

}
